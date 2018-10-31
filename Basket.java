
public class Basket  {
	private MarketProduct[] products;

	public Basket() {

		this.products= new MarketProduct[0];
	}

	public MarketProduct[] getProducts() {
		return this.products.clone();
	}
	public void add(MarketProduct mp) {

		MarketProduct[] temp= new MarketProduct[products.length+1];

		for(int i=0; i< products.length; i++) {
			temp[i]=products[i];
		}
		temp[products.length]= mp;

		this.products=temp;
	}

	public boolean remove(MarketProduct mp) {

		int size=this.products.length;
		boolean prodFound= false;
		int i=0;

		while(i< this.products.length && !prodFound) {


			if(products[i].equals(mp)) {
				prodFound=true;
			}

			i++;
		}

		for(int j = i; j< products.length; j++) {

			this.products[j-1]=products[j];

		}
		MarketProduct[] temp= new MarketProduct[size-1];
		for (int k=0; k< temp.length;k++) {
			temp[k]=this.products[k];
		}

		this.products= temp;

		return prodFound;
	}

	public void clear() {

		this.products= new MarketProduct[0];
	}
	public int getNumOfProducts() {
		return this.products.length;
	}

	public int getSubTotal() {
		int total=0;
		for(int i=0; i< this.products.length; i++) {
			total+=this.products[i].getCost();
		}
		return total;
	}
	public int getTotalTax() {
		int tax=0;
		for (int i=0; i< this.products.length; i++) {
			if(this.products[i] instanceof Jam) {
				tax+= (products[i].getCost()*15)/100;
			}
		}
		return tax;
	}
	public int getTotalCost(){
		return this.getSubTotal()+this.getTotalTax();
	}
	public String toString() {

		String s= "";

		for(int i=0; i< this.products.length; i++) {
			s+= products[i].getName()+"\t"+ format(products[i].getCost())+"\n";
		}

		s+="\n"+ "Subtotal "+ format(this.getSubTotal())+ "\nTotal tax "+  format(this.getTotalTax())+ "\n\nTotal Cost "
				+ format(this.getTotalCost());


		return s;

	}

	private String format(int cents) {
		if(cents<=0) {
			return "-";
		}
		else {
			if(cents%100<10) {
				return cents/100 + ".0"+ cents%100;
			}

			else {
				return cents/100+ "."+ cents%100;
			}
		}
	}
}

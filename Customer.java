
public class Customer {

	private String name;
	private int balance;
	private Basket products;

	public Customer(String name, int balance) {
		this.products= new Basket();
		this.name= name;
		this.balance= balance;
	}
	public String getName() {
		return this.name;
	}
	public int getBalance() {
		return this.balance;
	}
	public Basket getBasket() {
		return this.products;
	}
	public int addFunds(int add) {
		if(add<0) {
			throw new IllegalArgumentException("Sorry, you cannot add negative funds");
		}
		else {
			this.balance+=add;
			return balance;
		}
	}
	public void addToBasket(MarketProduct newProd) {
		this.products.add(newProd);

	}
	public boolean removeFromBasket(MarketProduct expired) {
		return this.products.remove(expired);
	}
	public String checkOut() {

		if (this.balance<this.products.getTotalCost()) {
			throw new IllegalStateException("Sorry, you don't have enought money to afford these products");
		}
		else {
			this.balance-= this.products.getTotalCost();
			String s= this.products.toString();
			this.products.clear();
			return s; 

		}
	}
}

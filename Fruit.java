
public class Fruit extends MarketProduct {

	private double weight;
	private int ppKg;

	public Fruit(String name, double weight, int ppKg) {
		super(name);
		this.weight= weight;
		this.ppKg= ppKg;

	}
	public int getCost() {
		return (int)(weight*ppKg);
	}

	public boolean equals(Object obj) {

		if (obj instanceof Fruit) {

			Fruit temp= (Fruit)obj;

			if (temp.getName().equals(this.getName()) && temp.getCost()== this.getCost() && temp.weight== this.weight)
			{
				return true;
			}
			else {
				return false;}
		}

		else {
			return false;}
	}

}

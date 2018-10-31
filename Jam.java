
public class Jam extends MarketProduct {

	private int numJars;
	private int ppJar;

	public Jam(String name, int numJars, int ppJar) {
		super(name);
		this.numJars= numJars;
		this.ppJar= ppJar;

	}

	public int getCost() {
		return numJars*ppJar;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Fruit) {

			Jam temp= (Jam)obj;

			if (temp.getName().equals(this.getName()) && temp.getCost()== this.getCost() && temp.numJars== this.numJars)
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

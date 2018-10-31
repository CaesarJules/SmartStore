
public class Egg extends MarketProduct {

	private int numberOfEggs;
	private int ppDozen;

	public Egg(String name, int numOfEggs, int ppDozen) {
		super(name);
		this.numberOfEggs= numOfEggs;
		this.ppDozen= ppDozen;
	}

	public int getCost() {
		return (ppDozen*numberOfEggs)/12;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Egg)
		{
			Egg tmp = (Egg) obj;
			if(tmp.getName().equals(this.getName()) && tmp.getCost() == (this.getCost()) && tmp.numberOfEggs == this.numberOfEggs)
				return true;
			else {
				return false;}
		}
		else {
			return false;}

	}
}

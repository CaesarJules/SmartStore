
public class SeasonalFruit extends Fruit {

	public SeasonalFruit(String name, double weight, int price) {
		super(name, weight,price);
	}

	public int getCost() {

		return super.getCost()*85/100;
	}

}

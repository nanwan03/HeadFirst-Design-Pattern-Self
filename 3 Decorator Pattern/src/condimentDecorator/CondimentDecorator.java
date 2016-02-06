package condimentDecorator;
import beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;

	public Size getSize() {
		return beverage.getSize();
	}

	public abstract String getDescription();
}

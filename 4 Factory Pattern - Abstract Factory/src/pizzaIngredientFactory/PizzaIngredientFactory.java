package pizzaIngredientFactory;

import clam.Clams;
import pepperoni.Pepperoni;
import cheese.Cheese;
import sauce.Sauce;
import veggies.Veggies;
import dough.Dough;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();

}

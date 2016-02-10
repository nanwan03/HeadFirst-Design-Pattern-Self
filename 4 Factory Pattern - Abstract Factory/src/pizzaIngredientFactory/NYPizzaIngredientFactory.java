package pizzaIngredientFactory;

import pepperoni.Pepperoni;
import pepperoni.SlicedPepperoni;
import sauce.MarinaraSauce;
import sauce.Sauce;
import veggies.Garlic;
import veggies.Mushroom;
import veggies.Onion;
import veggies.RedPepper;
import veggies.Veggies;
import cheese.Cheese;
import cheese.ReggianoCheese;
import clam.Clams;
import clam.FreshClams;
import dough.Dough;
import dough.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

}

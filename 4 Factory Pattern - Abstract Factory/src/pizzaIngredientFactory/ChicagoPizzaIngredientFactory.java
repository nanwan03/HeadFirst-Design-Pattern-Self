package pizzaIngredientFactory;

import pepperoni.FrozenClams;
import pepperoni.Pepperoni;
import pepperoni.SlicedPepperoni;
import sauce.PlumTomatoSauce;
import sauce.Sauce;
import veggies.BlackOlives;
import veggies.Eggplant;
import veggies.Spinach;
import veggies.Veggies;
import cheese.Cheese;
import cheese.MozzarellaCheese;
import clam.Clams;
import dough.Dough;
import dough.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
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
		return new FrozenClams();
	}

}

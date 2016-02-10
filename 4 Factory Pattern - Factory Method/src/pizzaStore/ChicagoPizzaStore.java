package pizzaStore;

import pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if (type.equals("cheese")) {
    		return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
		    return new ChicagoStyleVeggiePizza();
		} else if (type.equals("clam")) {
		    return new ChicagoStyleClamPizza();
		} else if (type.equals("pepperoni")) {
	    	return new ChicagoStylePepperoniPizza();
		} else {
			return null;
		}
	}

}

package observable.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import observable.Quackable;
import observer.Observer;

public class Flock implements Quackable {
	List<Quackable> ducks = new ArrayList<Quackable>();

	public void add(Quackable duck) {
		ducks.add(duck);
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
	
	public String toString() {
		return "Flock of Ducks";
	}
}

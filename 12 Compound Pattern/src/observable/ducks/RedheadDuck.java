package observable.ducks;

import observable.Observable;
import observable.Quackable;
import observer.Observer;

public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
		notifyObservers();
	}
	
	public String toString() {
		return "Redhead Duck";
	}
}

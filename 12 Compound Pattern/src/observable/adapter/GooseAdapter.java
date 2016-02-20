package observable.adapter;

import goose.Goose;
import observable.Observable;
import observable.Quackable;
import observer.Observer;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
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
		goose.honk();
		notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}

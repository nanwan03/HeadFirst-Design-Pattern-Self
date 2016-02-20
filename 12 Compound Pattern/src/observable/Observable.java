package observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import observer.Observer;

public class Observable implements QuackObservable {
	List<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}

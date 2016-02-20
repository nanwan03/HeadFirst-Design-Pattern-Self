package observer;

import observable.QuackObservable;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

	public String toString() {
		return "Quackologist";
	}
}

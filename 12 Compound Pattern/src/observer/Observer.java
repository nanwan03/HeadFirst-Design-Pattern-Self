package observer;

import observable.QuackObservable;

public interface Observer {
	public void update(QuackObservable duck);
}

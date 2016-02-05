package observer;

import subject.Subject;

public interface Observer {
	public void update(Subject data, Object arg);
}

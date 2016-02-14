package iterator;

import java.util.Iterator;

import menu.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {
	public MenuComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}

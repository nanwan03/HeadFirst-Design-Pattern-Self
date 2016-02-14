package iterator;

import java.util.List;
import menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
	List<MenuItem> items;
	int position = 0;

	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
	}
}

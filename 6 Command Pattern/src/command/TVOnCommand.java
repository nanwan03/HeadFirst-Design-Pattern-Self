package command;

import vendors.TV;

public class TVOnCommand implements Command {
	TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv= tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
		tv.setInputChannel();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.off();
	}

}

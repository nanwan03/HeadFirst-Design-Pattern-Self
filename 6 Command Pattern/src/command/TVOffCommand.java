package command;

import vendors.TV;

public class TVOffCommand implements Command {
	TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv= tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.on();
	}

}

package command;

import vendors.GarageDoor;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}

}

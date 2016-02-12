package command;

import vendors.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		hottub.setTemperature(98);
		hottub.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		hottub.on();
	}

}

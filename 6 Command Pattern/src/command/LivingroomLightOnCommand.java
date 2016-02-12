package command;

import vendors.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;
	
	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}

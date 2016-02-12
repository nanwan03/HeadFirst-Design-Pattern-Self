package command;

import vendors.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;
	
	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}

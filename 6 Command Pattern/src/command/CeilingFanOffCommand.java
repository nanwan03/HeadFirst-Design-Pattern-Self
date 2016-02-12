package command;

import vendors.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		switch (prevSpeed) {
			case CeilingFan.HIGH: 	ceilingFan.high(); break;
			case CeilingFan.MEDIUM: ceilingFan.medium(); break;
			case CeilingFan.LOW: 	ceilingFan.low(); break;
			default: 				ceilingFan.off(); break;
		}
	}

}

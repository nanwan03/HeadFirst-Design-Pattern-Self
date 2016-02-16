package state;

import gumballMachine.GumballMachine;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public String toString() {
		return "sold out";
	}
}

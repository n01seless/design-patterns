package command;


public class CarUnLockedComm implements Command {

	private CarLock CarLock;
	
	public CarUnLockedComm(CarLock CarLock) {
		this.CarLock = CarLock;
	}

	
	
	
	@Override
	public void execute() {
		this.CarLock.switchOff();
	}

}

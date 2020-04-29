package command;

public class MainComm {

	public static void main(String[] args) {
		
		Remote remote = new Remote();
		CarLock CarLock = new CarLock();
		Command CarLockedComm = new CarLockedComm(CarLock);
		Command CarUnLockedComm = new CarUnLockedComm(CarLock);
		
		remote.setCommand(CarLockedComm);
		remote.pressButton();
		
		remote.setCommand(CarUnLockedComm);
		remote.pressButton();


	}

}

package command;

public class CarLock {
private Boolean CarLock;
	
	public void switchOn() {
		System.out.println("Car is locked");
		this.CarLock = true;
	}
	
	public void switchOff() {
		System.out.println("Car is unlocked");
		this.CarLock = false;
	}
}

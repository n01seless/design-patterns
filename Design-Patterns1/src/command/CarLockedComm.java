package command;

public class CarLockedComm implements Command {

		private CarLock CarLock;
		
		public CarLockedComm (CarLock CarLock) {
			this.CarLock = CarLock;
		}

		
		
		
		@Override
		public void execute() {
			this.CarLock.switchOn();
		}


}

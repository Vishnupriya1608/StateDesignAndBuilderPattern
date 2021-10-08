package statedesignAndbuilderpattern;

public class HasCopyfilesfromPendrive implements KeyboardState {
	
	KeyBoardBuilder keyboard;

	public HasCopyfilesfromPendrive(KeyBoardBuilder keyboard) {
		this.keyboard=keyboard;
	}

	public void turnon() {

		System.out.println("System is already On");

	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You already entered a PIN");

	}

	public void insertPendrive() {
		
		System.out.println("Insert a Pendrive");
		keyboard.setKeyboardState(keyboard.getYesPendriveStateBuild());

	}

	public void copyFilesfromPendrive() {
		
		System.out.println("Copying files from Pendrive to System");
	}

	public void ejectPendrive() {
		
		System.out.println("Your Pendrive is ejected");

	}

	public void shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownStateBuild());

}
}

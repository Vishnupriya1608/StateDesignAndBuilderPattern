package statedesignAndbuilderpattern;

public class HasPin implements KeyboardState {
	
	KeyBoardBuilder keyboard;

	public HasPin(KeyBoardBuilder keyboard) {
		this.keyboard=keyboard;
	}

	public void turnon() {

		System.out.println("Turn on the System");

	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You already entered a PIN");
		keyboard.setKeyboardState(keyboard.getHasPinBuild());

	}

	public void insertPendrive() {
		
		System.out.println("Insert a Pendrive");
		keyboard.setKeyboardState(keyboard.getYesPendriveStateBuild());

	}

	public void copyFilesfromPendrive() {
		
		System.out.println("Pendrive is not inserted yet");
	}

	public void ejectPendrive() {
		
		System.out.println("Your Pendrive is ejected");

	}

	public void shutdown() {
		
		System.out.println("Shutdown the System");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownStateBuild());


	}


}

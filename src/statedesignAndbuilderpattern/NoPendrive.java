package statedesignAndbuilderpattern;

public class NoPendrive implements KeyboardState {
	
	KeyBoardBuilder keyboard;

	public NoPendrive(KeyBoardBuilder keyboard) {
		this.keyboard=keyboard;
	}

   public void turnon() {
		
		System.out.println("Turn on the System");
		keyboard.setKeyboardState(keyboard.getKeyboardisOnStateBuild());

	}

    public void insertPin(int pinEntered) {
	System.out.println("You already entered the PIN");
	
    }

	public void insertPendrive() {
		
		System.out.println("Your Pendrive has been inserted");
		keyboard.setKeyboardState(keyboard.getYesPendriveStateBuild());
	}

	public void copyFilesfromPendrive() {
		System.out.println("No Pendrive to copy");
		
	}
	public void ejectPendrive() {
		
		System.out.println("You didn't insert a Pendrive");

	}
	
	public void shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownStateBuild());

	}

}

package statedesignAndbuilderpattern;

public class HasPendrive implements KeyboardState {
	
	KeyBoardBuilder keyboard;

	public HasPendrive(KeyBoardBuilder keyboard) {
		
		this.keyboard=keyboard;
		
	}

    public void turnon() {
		
		System.out.println("Turn on the System");
		keyboard.setKeyboardState(keyboard.getKeyboardisOnStateBuild());

	}
    
    public void insertPin(int pinEntered) {
	
	System.out.println("You already entered a PIN");
	
    }
	
	public void insertPendrive() {
		
		System.out.println("You can only insert one Pendrive at a time");

	}

	public void ejectPendrive() {
		
		System.out.println("Your Pendrive is ejected");
		keyboard.setKeyboardState(keyboard.getNoPendriveStateBuild());

	}
	
    public void shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownStateBuild());

	}

	

	public void copyFilesfromPendrive() {
		
		System.out.println("Copy files");
		keyboard.setKeyboardState(keyboard.getCopyfilesfromPendriveStateBuild());

		
	}


}

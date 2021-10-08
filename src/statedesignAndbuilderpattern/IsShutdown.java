package statedesignAndbuilderpattern;

public class IsShutdown implements KeyboardState {
	
	KeyBoardBuilder keyboard;

	public IsShutdown(KeyBoardBuilder keyboard) {
		this.keyboard=keyboard;
	}

    public void turnon() {
		
		System.out.println("System is already on");

	}

    public void insertPin(int pinEntered) {
	
	System.out.println("Pin is already entered");
	
    }

	public void insertPendrive() {
		
		System.out.println("you already inserted the pendrive");;

	}
	
    public void copyFilesfromPendrive() {
		
		System.out.println("Files are copied from Pendrive to the System");
		
	}

	public void ejectPendrive() {
		
		System.out.println("Your Pendrive is ejected");
		keyboard.setKeyboardState(keyboard.getNoPendriveStateBuild());


	}
	
	public void shutdown() {
		
		System.out.println("Shutdown the System");

	}
	

}

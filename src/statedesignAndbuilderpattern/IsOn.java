package statedesignAndbuilderpattern;

public class IsOn implements KeyboardState {
	
	KeyBoardBuilder keyboard;        

	public IsOn(KeyBoardBuilder keyboard) {
		this.keyboard=keyboard;
	}
	
    
	/*public IsOn() {
	}*/

public void turnon() {
		
		System.out.println("Turn on the System");

	}
	
	public void insertPin(int pinEntered) {
		
	    if(pinEntered == 1234){
				
				System.out.println("You entered the correct PIN");
				keyboard.correctPinEntered = true;
				keyboard.setKeyboardState(keyboard.getHasPinBuild());
				
			} else {
				
				System.out.println("You entered the wrong PIN");
				keyboard.correctPinEntered = false;
				System.out.println("Your Pendrive is ejected");
				keyboard.setKeyboardState(keyboard.getNoPendriveStateBuild());
				
			}	
			
		}

	public void insertPendrive() {
		
		System.out.println("Insert the pendrive");
		keyboard.setKeyboardState(keyboard.getYesPendriveStateBuild());

	}
	
	public void copyFilesfromPendrive() {
		
		System.out.println("Pendrive is not inserted yet");
		keyboard.setKeyboardState(keyboard.getCopyfilesfromPendriveStateBuild());
		
	}

	public void ejectPendrive() {
		
		System.out.println("Your Pendrive is ejected");
		keyboard.setKeyboardState(keyboard.getNoPendriveStateBuild());

	}
	
	public void shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownStateBuild());

	}


}

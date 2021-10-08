package statedesignAndbuilderpattern;

public class TestKeyboard {

	public static void main(String[] args) {
		KeyBoardBuilder keyboard = new KeyBoardBuilder();
		
		keyboard.turnon();
		
		keyboard.insertPin(1234);
		
		keyboard.insertPendrive();
		
		keyboard.copyFilesfromPendrive();
		
		keyboard.ejectPendrive();
		
		keyboard.shutdown();
		
		keyboard.turnon();
		
		keyboard.insertPin(1234);
		
		keyboard.insertPendrive();
		
		keyboard.ejectPendrive();

	}

}

package statedesignAndbuilderpattern;

public interface KeyboardState {
	
	void turnon();	
	void insertPin(int pinEntered);
	void insertPendrive();
	void copyFilesfromPendrive();
	void ejectPendrive();
	void shutdown();


}

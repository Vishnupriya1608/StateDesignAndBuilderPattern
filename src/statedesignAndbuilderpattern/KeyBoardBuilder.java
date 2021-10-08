package statedesignAndbuilderpattern;

public class KeyBoardBuilder {
	
	KeyboardState isOn;

	KeyboardState hasCorrectPin;
	
	KeyboardState hasPendrive; 
	
	KeyboardState hascopyfilesfromPendrive;
	
	KeyboardState noPendrive;
		
	KeyboardState isShutdown;
	     
	
	KeyboardState KeyboardState;
	
	     int Copyfiles = 10;
	     
	     boolean correctPinEntered = false;
	
        public KeyBoardBuilder(){
	
	    	isOn = new IsOn(this);
	    	
	    	hasCorrectPin = new HasPin(this);
	    	
	    	hasPendrive = new HasPendrive(this);
	    	
	    	hascopyfilesfromPendrive = new HasCopyfilesfromPendrive(this);
	
	    	noPendrive = new NoPendrive(this);	    	
	    	
	    	isShutdown = new IsShutdown(this);	    	
	
	        KeyboardState = noPendrive;
	        	        
	        if(Copyfiles < 0){
	    		    		
	        	KeyboardState = isShutdown;
             
	
	        }         
	
	    }
	
	     	
	    void setKeyboardState(KeyboardState newKeyboardState){
	
	    	KeyboardState = newKeyboardState;	
	    }
	    
	    public void setCopyFiles(int newCopyfiles){
				         
	    	Copyfiles = newCopyfiles;	         
	
	    }

	    public void turnon() {	         
	
	    	KeyboardState.turnon();
		         
	    }
	    public void insertPin(int pinEntered){
	         
	    	KeyboardState.insertPin(pinEntered);
			         		
		    }
	    
	    public void insertPendrive() {	         
	    	
	    	KeyboardState.insertPendrive();	         
	
	    }
	   
	    public void copyFilesfromPendrive() {
	    	
	    	KeyboardState.copyFilesfromPendrive();
	    	
	    }
	
	    public void ejectPendrive() {
		
	    	KeyboardState.ejectPendrive();
		
	    }
	
	    public void shutdown(){
			         
	    	KeyboardState.shutdown();		         
	
	    }
	   	
	    public KeyboardState getKeyboardisOnStateBuild() { 
	    	return isOn; 
	    }
	    
	    public KeyboardState getHasPinBuild() {
	    	return hasCorrectPin; 
	    }
	
	    public KeyboardState getYesPendriveStateBuild() { 
	    	return hasPendrive; 
	    }

	    public KeyboardState getCopyfilesfromPendriveStateBuild() { 
	    	return hascopyfilesfromPendrive; 
	    }
	
	    public KeyboardState getNoPendriveStateBuild() { 
	    	return noPendrive; 
	    }
	
	    public KeyboardState getKeyboardShutdownStateBuild() { 
	    	return isShutdown; 
	    	}

}

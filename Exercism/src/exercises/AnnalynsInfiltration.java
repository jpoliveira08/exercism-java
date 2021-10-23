package exercises;

class AnnalynsInfiltration {
	

	
    public static boolean canFastAttack(boolean knightIsAwake) {
    	/*
    	 * a fast attack can be made if the knight is sleeping,
    	 * as it takes time for him to get his armor on, so he will be vulnerable.
    	 */
    	if (knightIsAwake) {
    		return false;
    	}
    	return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    	/*
    	 * The group can be spied upon if at least one of them is awake. Otherwise, spying is a waste of time.
    	 */
    	if(archerIsAwake || knightIsAwake || prisonerIsAwake) {
    		return true;
    	}
    	return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    	/*
    	 * The prisoner can be signalled using bird sounds if the prisoner is awake and the archer is sleeping,
    	 * as archers are trained in bird signaling, so they could intercept the message.
    	 */
    	if(!archerIsAwake && prisonerIsAwake) {
    		return true;
    	}
    	return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    	if((knightIsAwake || !knightIsAwake) && !archerIsAwake && (prisonerIsAwake || !prisonerIsAwake) && petDogIsPresent) {
    		return true;
    	}
    	else if(prisonerIsAwake && (petDogIsPresent || !petDogIsPresent) && !knightIsAwake && !archerIsAwake) {
    		return true;
    	}
    	return false;
    }
    
}


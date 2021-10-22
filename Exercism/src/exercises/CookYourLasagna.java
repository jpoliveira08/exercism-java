package exercises;

public class CookYourLasagna {
	
    // TODO: define the 'expectedMinutesInOven()' method
    int timeToCook = 40;
    int mult = 2;
    
    int expectedMinutesInOven(){
        //Doesn't take any parameters, but return a number
        return this.timeToCook;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    int remainingMinutesInOven(int ovenTime){
        return this.timeToCook - ovenTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers * mult;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    int totalTimeInMinutes(int numberOfLayers, int ovenTime) {
    	return this.preparationTimeInMinutes(numberOfLayers) + ovenTime;
    }

}




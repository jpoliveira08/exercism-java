package exercises;

public class BirdWatcher {
	/*
	 * You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.
	 */
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
    	return this.birdsPerDay;
    }

    public int getToday() {
    	if(birdsPerDay.length == 0) {
    		return 0;
    	}
    	return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
    	if(birdsPerDay.length > 0) {
    		this.birdsPerDay[birdsPerDay.length - 1] += 1;    		    		    		    		
    	}
    }

    public boolean hasDayWithoutBirds() {
    	/*
    	 * returns true if there was a day at which zero birds visited the garden; otherwise, return false
    	 */
        for(int birdPerDay : birdsPerDay) {
        	if(birdPerDay == 0) {
        		return true;
        	}
        }
        return false;
        }

    public int getCountForFirstDays(int numberOfDays) {
    	/*
    	 *returns the number of birds that have visited your garden from the start of the week,
    	 *but limit the count to the specified number of days from the start of the week. 
    	 */
    	int sumDays= 0;
    	if (numberOfDays >= birdsPerDay.length) {
        	for(int i = 0; i < birdsPerDay.length; i++) {
        		sumDays += birdsPerDay[i];
        	}
    	}
    	else {
    		for(int i = 0; i < numberOfDays; i++) {
    			sumDays += birdsPerDay[i];
    		}    		
    	}
    	return sumDays;
    	}

    public int getBusyDays() {
    	/*
    	 * A busy day is one where five or more birds have visited your garden
    	 */
    	int countBusyDays = 0;
        for(int birdPerDay : birdsPerDay) {
        	if(birdPerDay >= 5) {
        		countBusyDays++;
        	}
        }
        return countBusyDays;
    }

}

   
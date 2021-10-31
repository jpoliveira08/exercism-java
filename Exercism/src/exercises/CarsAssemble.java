package exercises;

public class CarsAssemble {
	private int cars = 221;
	public double productionRatePerHour(int speed) {
		/**
		 * method to calculate the assembly line's production rate per hour,
		 * taking into account its current assembly line's speed
		 */
		if(speed >= 1 && speed < 5)
		{
			return speed * this.cars;
		}
		else if(speed >= 5 && speed < 9)
		{
			return 0.9 * speed * this.cars;
		}
		else if(speed == 9)
		{
			return 0.8 * speed * this.cars;
		}
		else if(speed == 10)
		{
			return 0.77 * speed * this.cars;
		}
		else
		{
			return 0;
		}
		
	}
	
	public int workingItemsPerMinute(int speed) {
		return (int) this.productionRatePerHour(speed) / 60;
	}
}



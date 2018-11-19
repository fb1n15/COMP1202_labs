/**
 * Class describing all cars
 * @author Wojciech Rozowski (wkr1u18)
 *
 */
public class Car extends RoadVehicle implements Refuelable {

	/**
	 * Moves the car.
	 */
	@Override
	public void move() {
		System.out.println("Wroom wroom, riding on road");
	}
	
	/** Tanks the car
	 *  @see Refuelable#tank()
	 */
	@Override
	public void tank() {
		System.out.println("Tanking your car with gasoline.");
	}

}

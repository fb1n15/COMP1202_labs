/**
 * Class describing jet aeroplanes
 * @author Wojciech Rozowski (wkr1u180
 *
 */
public class JetPlane extends Transport implements Refuelable {

	/**
	 * Moves the plane in the sky
	 */
	@Override
	public void move() {
		System.out.println("Flying through the skies!!!");
	}
	
	/** Tanks the plane with fuel
	 * @see Refuelable#tank()
	 */
	@Override
	public void tank() {
		System.out.println("Tanking your plane with jet fuel!");
	}

}

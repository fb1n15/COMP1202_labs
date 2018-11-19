/**
 * Main class of the lab8part3 project
 * @author Wojciech Rozowski (wkr1u18)
 *
 */

public class Main {
	/**
	 * Testes methods of all objects of {@link Transport hierarchy}
	 * @param args Ignored arguments form command line
	 */
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.tank();
		myCar.move();
		
		JetPlane myJetPlane = new JetPlane();
		myJetPlane.tank();
		myJetPlane.move();
		
		Cycle myBicycle = new Bicycle();
		myBicycle.move();
	}
}

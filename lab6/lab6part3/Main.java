/**
 * Main class for the lab6part3. It tests the basic methods of {@link Animal} and {@link Food} objects.
 * @author Wojciech Rozowski (wkr1u18)
 */


public class Main {
	/**
	 * Static main method containing all the testing procedures.
	 * @param args Command lines arguments passed to the program, which doesn't affect the behaviour of the program.
	 */
	public static void main(String[] args) throws Exception{
		//Creating instances of Wolf and Parrot classes
		Wolf myWolf = new Wolf("Johnny", 15);
		Parrot myParrot = new Parrot("Daisy", 2);
		
		//Testing inherited getName and getAge methods on test objects
		System.out.println("Name: " + myWolf.getName() + " Age: " + myWolf.getAge());
		System.out.println("Name: " + myParrot.getName() + " Age: " + myParrot.getAge());
		
		//Testing overriden makeNoise method
		myWolf.makeNoise();
		myParrot.makeNoise();
		
		//Creating instanes of Meat and Plant classes
		Meat myMeat = new Meat("Meat");
		Plant myPlant = new Plant("Plant");
		
		//Testing eat method using try-catch block
		try {
			myWolf.eat(myMeat);
			myParrot.eat(myPlant);	
		}
		catch (Exception e){
			//Prints Exception to System.err output stream
			System.err.print(e);
		}
		
	}
}
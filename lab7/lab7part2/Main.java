/**
 * Main class for the lab7part2
 * @author Wojciech Rozowski (wkr1u18)
 *
 */
public class Main {
	/**
	 * Main method running constructing the Calculator object and running all the tests using {@link TestCalculator} class.
	 * @param args command line arguments which are ignored in this case.
	 */
	public static void main (String[] args) {
		Calculator testedCalculator = new Calculator();
		TestCalculator tester = new TestCalculator();
		//Run the tests, and if all of them pass put success message
		Boolean test1, test2, test3;
		test1 = tester.testParser(testedCalculator);
		test2 = tester.testAdd(testedCalculator);
		test3 = tester.testMultiplication(testedCalculator);
		
		if(test1&&test2&&test3) {
			System.out.println("Congratulations, your Calculator appears to be working.");
		}
	}
}

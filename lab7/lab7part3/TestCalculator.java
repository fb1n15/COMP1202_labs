/**
 * Class providing tests for Calculator Class
 * @author Wojciech Rozowski (wkr1u18)
 *
 */
public class TestCalculator {
	/**
	 * Tests the parsing functions of Calculator class
	 * @param calculator reference to Calculator object to be tested
	 * @return boolean value, which is true when all the test pass
	 */
	boolean testParser(Calculator calculator) {
		Boolean test1, test2, test3;
		
		//Test whether parser adds correctly
		if(calculator.x("12 + 5").equals(new Double (17))) {
			test1 = true;
			System.out.println("[ OK ] Parser adds correctly.");
		}
		else {
			test1 = false;
			System.out.println("[FAIL] Basic parsing fails to add.");
		}
		
		//Test whether parser multiplies correctly
		if(calculator.x("12 x 5").equals(new Double (60))) {
			test2 = true;
			System.out.println("[ OK ] Parser multiplies correctly.");
		}
		else {
			test2 = false;
			System.out.println("[FAIL] Basic parsing fails to multiply.");
		}

		//Test whether parser returns null for operators which are not supported
		if(calculator.x("12 [ 3") == null) {
			test3 = true;
			System.out.println("[ OK ] Parser returns null for operators which are not supported.");
		}
		else {
			test3 = false;
			System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
		}
		
		//returns true when all the test pass
		return test1 && test2 && test3;
	}
	
	/**
	 * Tests the addition functions of Calculator class
	 * @param calculator reference to Calculator object to be tested
	 * @return boolean value, which is true when all the test pass
	 */
	boolean testAdd(Calculator calculator) {
		Boolean test1, test2;
		
		
		//Positive number addition test
		calculator.x = 5.0;
		if(calculator.x(new Double(12.0)).equals(new Double(17.0))) {
			test1 = true;
			System.out.println("[ OK ] Calculator adds correctly.");
		}
		else {
			test1 = false;
			System.out.println("[FAIL] Calculator adds incorrectly.");
		}
		
		//negative number addition test
		calculator.x = -5.0;
		if(calculator.x(new Double(12.0)).equals(new Double(7.0))) {
			test2 = true;
			System.out.println("[ OK ] Calculator adds with negative numbers correctly.");
		}
		else {
			test2 = false;
			System.out.println("[FAIL] Calculator adds with negative numbers incorrectly.");
		}
			
		//returns true when all the test pass
		return test1 && test2;
	}
	
	/**
	 * Tests the multiplication functions of Calculator class
	 * @param calculator reference to Calculator object to be tested
	 * @return boolean value, which is true when all the test pass
	 */
	boolean testMultiplication(Calculator calculator) {
		Boolean test1, test2, test3;
		//Positive number multiplication test
		calculator.x = 5.0;
		if(calculator.x((double) 12.0).equals(new Double(60.0))) {
			test1 = true;
			System.out.println("[ OK ] Calculator multiplies correctly.");
		}
		else {
			test1 = false;
			System.out.println("[FAIL] Calculator multiplies incorrectly.");
		}
				
		//negative number multiplication test
		calculator.x = -5.0;
		if(calculator.x((double) -12.0).equals(new Double(60.0))) {
			test2 = true;
			System.out.println("[ OK ] Calculator multiplies with negative numbers correctly.");
		}
		else {
			test2 = false;
			System.out.println("[FAIL] Calculator multiplies with negative numbers incorrectly.");
		}
					
		//returns true when all the test pass
		return test1 && test2;
	}
	
	
}

public class FizzBuzz { //wrapper of FizzBuzz class
	public static void main(String[] args) { //main method wrapper
		for(Integer i = new Integer(1); i < 61; i++){ //execute the for loop, for all values of Integer i in the range of [1,10]
			if(i % 3 != 0 && i % 5 != 0){ //if value of Integer I is not divisible both by 3 and 5, execute following procedures 
					System.out.print(i); //put the value of Integer I to the standard output
				} //end of if statement
			if(i % 3 == 0){ //if the value of Integer I is divisible by 3, execute following procedures
				System.out.print("Fizz"); //pass the string "Fizz" to the standard output
			} //end of if statement
			if(i % 5 == 0){ //if the value of Integer I is divisible by 5, execute following procedures
				System.out.print("Buzz"); //pass the string "Buzz" to the standard output
			} //end of if statement
			System.out.println(); //go to new line - pass character '\n' to the standard output
			} //end of if statement
	} //end of main method wrapper	
} //end of wrapper of FizzBuzz class

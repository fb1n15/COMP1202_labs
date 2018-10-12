/**
 * Implementation of ATM class for first part of the lab
 * Lab 2 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class ATM {
	private Integer balance = new Integer(0);
	private Toolbox myToolbox = new Toolbox();

	//Method displaying menu, taking user input, setting initial balance and invoking the correct method depending on the user's choice
	public void go() {
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		//System.out.println("Enter your number");
		//"Enter your number" shown by readIntegerFromCmd() is not acknowledged in lab2part2 test, so it needs to be shown again.
		balance = myToolbox.readIntegerFromCmd();
		System.out.println(balance);
	}

	public static void main(String[] Args) {
		ATM myATM = new ATM(); //declaration of new object myATM of class ATM
		myATM.go();
	}
}

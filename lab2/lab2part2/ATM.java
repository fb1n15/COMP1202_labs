/**
 * Implementation of ATM class for second part of the lab
 * Lab 2 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class ATM {
	private Integer balance = new Integer(0);
	private Toolbox myToolbox = new Toolbox();
	
	//Method to ask user for amount to withdraw, then decrease value of account by withrawal amount
	public void withdraw() {
		System.out.println("How much would you like to withdraw?");
		Integer toWithdraw = new Integer(0);
		toWithdraw = myToolbox.readIntegerFromCmd();
		balance -= toWithdraw; //Substract ammunt to withdraw from balance
		System.out.print("Your new balance is: ");
		System.out.println(balance);
	}
	
	//Method to ask user for amount to deposit, then increase value of account by withrawal amount	
	public void deposit() {
		System.out.println("How much would you like to deposit?");
		Integer toDeposit = new Integer(0);
		toDeposit = myToolbox.readIntegerFromCmd();
		balance += toDeposit; //Increase the account balance by deposit value
		System.out.print("Your new balance is: ");
		System.out.println(balance);
	}

	//Accessor method to balnce field
	public void inquire() {
		System.out.print("Your balance is: ");
		System.out.println(balance);
	}

	//Method quiting the program
	public void quit() {
		System.exit(0);
	}
	
	//Method displaying menu, taking user input, setting initial balance and invoking the correct method depending on the user's choice
	public void go() {
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		balance = myToolbox.readIntegerFromCmd();
		System.out.println(balance);
		String welcome = "What do you want to do?\n" +
				"1 : Withdraw\n" +
				"2 : Deposit\n" +
				"3 : Inquire\n" +
				"4 : Quit\n" +
				"Enter your number";
		//Even though "Enter your number" string is passed to the output by readIntegerFromCmd() it needs to be printed from go() method to pass succesfully through test harness
		System.out.println(welcome);
		Integer option = new Integer(0);
		option = myToolbox.readIntegerFromCmd();
		//calling apropriate methods of ATM class to users choice
		if(option==1) {
			withdraw();			
		}
		else if(option==2) {
			deposit();
		}
		else if(option==3) {
			inquire();
		}
		else if(option==4) {
			quit();
		}
	}

	public static void main(String[] Args) {
		ATM myATM = new ATM(); //Declaration of new object myATM of class ATM
		myATM.go();
	}
}

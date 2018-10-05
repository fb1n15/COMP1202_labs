//The version of the lab2part2 ATM.java utilisng switch, instead of series of if's

public class ATMswitch {
	Integer balance = new Integer(0);
	Toolbox myToolbox = new Toolbox();
	
	public void withdraw() {
		System.out.println("How much would you like to withdraw?");
		Integer toWithdraw = new Integer(0);
		toWithdraw = myToolbox.readIntegerFromCmd();
		balance -= toWithdraw; //substract ammunt to withdraw from balance
		System.out.print("Your new balance is: ");
		System.out.println(balance);
	}
		
	public void deposit() {
		System.out.println("How much would you like to deposit?");
		Integer toDeposit = new Integer(0);
		toDeposit = myToolbox.readIntegerFromCmd();
		balance += toDeposit;
		System.out.print("Your new balance is: ");
		System.out.println(balance);
	}

	public void inquire() {
		System.out.print("Your balance is: ");
		System.out.println(balance);
	}

	public void quit() {
		System.exit(0);
	}
	
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
		switch(option){
			case 1:
				withdraw();
				break;
			case 2:
				deposit();
				break;
			case 3:
				inquire();
				break;
			case 4:
				quit();
				break;
		}
	}

	public static void main(String[] Args) {
		ATM myATM = new ATM(); //declaration of new object myATM of class ATM
		myATM.go();
	}
}

public class ATM {
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
		while(true) {
			String welcome = "What do you want to do?\n" +
					"1 : Withdraw\n" +
					"2 : Deposit\n" +
					"3 : Inquire\n" +
					"4 : Quit\n" +
					"Enter your number";

			System.out.println(welcome);
			Integer option = new Integer(0);
			option = myToolbox.readIntegerFromCmd();

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
	}

	public static void main(String[] Args) {
		ATM myATM = new ATM(); //declaration of new object myATM of class ATM
		myATM.go();
	}
}

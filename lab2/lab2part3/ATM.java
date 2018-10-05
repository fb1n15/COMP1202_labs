public class ATM {
	Integer balance = new Integer(-1); //initialise balance with negative value, so it satisfies the condition of while loop
	Toolbox myToolbox = new Toolbox();
	
	public void withdraw() {
		System.out.println("How much would you like to withdraw?");
		Integer toWithdraw = new Integer(-1); //same case as with balance
		while (toWithdraw<0) {
			toWithdraw = myToolbox.readIntegerFromCmd();
			if(toWithdraw>balance) {
				toWithdraw = -1; //when toWithdraw is bigger than balance, then set it's value to negative
			}
		}
		balance -= toWithdraw; //substract ammunt to withdraw from balance
		System.out.print("Your new balance is: ");
		System.out.println(balance);
	}
		
	public void deposit() {
		System.out.println("How much would you like to deposit?");
		Integer toDeposit = new Integer(-1);
		while(toDeposit<0) {
			toDeposit = myToolbox.readIntegerFromCmd();
		}
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
		while(balance<0) {
			balance = myToolbox.readIntegerFromCmd();
		}
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

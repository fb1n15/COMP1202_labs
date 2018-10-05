public class ATM
{
	Integer balance = new Integer(0);
	Toolbox myToolbox = new Toolbox();


	public static void main(String[] Args)
	{
		ATM myATM = new ATM();
		myATM.go();
	}

	public void go()
	{
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		System.out.println("Enter your number");
		balance = myToolbox.readIntegerFromCmd();
		System.out.println(balance);
		System.out.println("What do you want to do?");
		System.out.println("1 : Withdraw\n2 : Deposit\n3 : Inquire\n4 : Quit\nEnter your number");
		Integer option = myToolbox.readIntegerFromCmd();
		if(option==1)
		{
						System.out.println("*****************************************\nWithdrawal\n*****************************************\nHow much would you like to withdraw?\nEnter your number");
			Integer toWithdraw = myToolbox.readIntegerFromCmd();
			System.out.print("*****************************************\n         Your new balance is ");
			balance -= toWithdraw;
			System.out.println(balance);
			System.out.println("*****************************************");		
		}
		if(option==2)
		{
System.out.println("*****************************************\nWithdrawal\n*****************************************\nHow much would you like to deposit?\nEnter your number");
			Integer toDeposit = myToolbox.readIntegerFromCmd();
			System.out.print("*****************************************\n         Your new balance is ");
			balance += toDeposit;
			System.out.println(balance);
			System.out.println("*****************************************");
		}
		if(option==3)
		{
			System.out.print("*****************************************\n         Your balance is ");
			System.out.println(balance);
			System.out.println("*****************************************");	
		}
		if(option==4)
		{
			System.out.println("******************************************\n         GoodBye\n******************************************");
		}
		
	}
}

public class ATM {
	Integer balance = new Integer(0);
	Toolbox myToolbox = new Toolbox();

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

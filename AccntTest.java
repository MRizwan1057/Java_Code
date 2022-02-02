// Fig. 3.6: AccountTest.java
 // Using the Account constructor to initialize the name instance
 // variable at the time each Account object is created
 
 public class AccntTest
 {
	public static void main(String[] args)
	{
		// create 2 Account objects
		Accnt account1 = new Accnt("Muhammad Rizwan");
		Accnt account2 = new  Accnt ("Muhammad Usman");
				
		// display initial value for each Account
			System.out.printf("account1 name is: %s %n", account1.getName());
			System.out.printf("account2 name is: %s %n", account2.getName());
	}
 
 }
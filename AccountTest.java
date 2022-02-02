// AccountTest.java
// creating & manipulating an Account object
import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		// create object to obtain input
		Scanner input = new Scanner (System.in);
		//create an account object abd assign it to myAccount
		Account myAccount = new Account();
			
		//display initial value of name (null)	
		System.out.printf("initial name is: %s %n %n", myAccount.getName());
		
		// prompt & read name
		System.out.println("enter the name: ");
		String theName = input.nextLine(); // read text line
		myAccount.setName(theName); // put the name in myAccount
		System.out.println(); // output a blank line
		//now display the name stored in myAccount
		System.out.printf("Name in object myAccount is: %n %s %n",myAccount.getName());
		
	}
}
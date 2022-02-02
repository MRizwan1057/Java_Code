import java.util.Scanner;
public class Account1Test
{
	public static void main(String[] args)
	{
	
	Account1 acc1 = new Account1("Muhammd Rizwan" ,50.0);
	Account1 acc2 = new Account1("Usman Anas", -7.53);
	
	//initial balance of each account object
	
	System.out.printf("%s balance: $ %.2f %n",
		acc1.getName(), acc1.getBalance());
	
	System.out.printf("%s balance: $ %.2f %n%n",
		acc2.getName(), acc2.getBalance());
	
	//create Scanner to prompt user
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter deposit amount for account1: ");
	double depositAmount = input.nextDouble();
	System.out.printf("%n adding %.2f to acc1 balance %n%n",
	depositAmount);
	acc1.deposit(depositAmount);
	
	//display balance
	System.out.printf("%s balance: $  %.2f %n", acc1.getName(), acc1.getBalance());
	
	System.out.printf("%s balance: $  %.2f %n", acc2.getName(), acc2.getBalance());
	
	
	System.out.print("Enter deposit amount for account2: ");
	depositAmount = input.nextDouble();
	System.out.printf("%n adding %.2f to acc2 balance %n%n",
	depositAmount);
	acc2.deposit(depositAmount);
	
	//display balance
	System.out.printf("%s balance: $ %.2f %n", acc1.getName(), acc1.getBalance());
	
	System.out.printf("%s balance: $ %.2f %n", acc2.getName(), acc2.getBalance());
	
	}

}
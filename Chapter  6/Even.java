
//import java.util.Scanner;
import java.security.SecureRandom;
public class Even
{
	public static void main(String[] args)
	{
		//System.out.print("Please Enter an Integer: ");
		//Scanner input = new Scanner(System.in);
		//int number = input.nextInt();
		SecureRandom randomNumbers = new SecureRandom();
		int number = randomNumbers.nextInt(100);
		System.out.printf("Given Random number is: %d %n", number);
		System.out.println((myEven(number)) ? "The number is Even" : "The number is odd");
	}
	
	public static boolean myEven(int number)
	{
		
		if(number % 2 == 0)
			return true;
		else
			
		return false;
	}
	
	
}
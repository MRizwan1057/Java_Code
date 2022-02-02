
//import java.util.Scanner;

import java.security.SecureRandom;
public class Multiple
{
	public static void main(String[] args)
	{
		// creating object
		SecureRandom randomNumbers = new SecureRandom();
		int number1 = 2 + randomNumbers.nextInt(11);
		int number2 = 2 + randomNumbers.nextInt(51);
		
			// we can execute it by prompting user
			// System.out.print("Please Enter first Integer: ");
			// Scanner input = new Scanner(System.in);
			// int number1 = input.nextInt();
			// System.out.print("Please Enter second Integer: ");
			//Scanner input = new Scanner(System.in);
			// int number2 = input.nextInt();
		
		System.out.printf("first number is: %d %n second number is: %d%n",number1, number2);
		 System.out.println((isMultiple(number1,number2)) ? "second number is a multiple of first number" : "second number is not a multiple of first number");
	}
	
	public static boolean isMultiple(int number1, int number2)
	{
		
		if(number2 % number1 == 0)
			return true;
		else
			
		return false;
	}
	
	
}
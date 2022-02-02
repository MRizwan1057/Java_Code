/*
import java.util.Scanner;
public class Addition
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		System.out.print("Please enter a number :  ");
		number1 = input.nextInt();
		System.out.print("Please enter another number :  ");
		number2 = input.nextInt();
		sum = number1 + number2;
		System.out.printf("Sum is %d%n", sum);
	}
}
*/

import java.util.Scanner; 	// class scanner usage// user input
public class Addition
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);// declare input user
		int number1;  // "int = let in javascript" declare variables// initialization
		int number2;
		int sum;
		int sub;
		int mul;
		int div;
		int mod;
		System.out.print("Please enter a number :  ");  	// instructions/ messages for user
		number1 = input.nextInt();		// read the first number
		System.out.print("Please enter another number :  ");
		number2 = input.nextInt();		// read the second number
		sum = number1 + number2;
		sub = number1 - number2;
		mul = number1 * number2;
		div = number1 / number2;
		mod = number1 % number2;	
			// now we are going to display our desired results
		System.out.printf("Sum is %d%n sub is %d%n mul is %d%n div is %d%n mod is %d%n", sum,sub , mul, div, mod);
	}
}

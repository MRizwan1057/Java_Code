// comparision by using if , relational and equality operators 
import java.util.Scanner;// this program uses class scanner
public class Comparision
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);// creating scanner to get input from user
		int number1;
		int number2;
		System.out.print("Enter a number: ");// prompt
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
	
		if (number1 == number2)
			System.out.printf("%d == %d %n", number1, number2);
	
	
	if (number1 != number2)
			System.out.printf("%d != %d %n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d %n", number1, number2);
		if (number1 > number2)
			System.out.printf("%d > %d %n", number1, number2);
		if (number1 <= number2)
			System.out.printf("%d <= %d %n", number1, number2);
		if (number1 >= number2)
			System.out.printf("%d >= %d %n", number1, number2);
				
		
	}// end method
	
} // end class
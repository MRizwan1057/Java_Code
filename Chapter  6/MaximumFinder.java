

import java.util.Scanner;

public class MaximumFinder
{
	// obtain 3 floating point values and lacate the maximum value.
	public static void main(String[] args)
	{
		//create scanner
		Scanner input = new Scanner(System.in);
		//prompt user
		System.out.print("Enter 3 floating point values separated by spaces: ");
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double result = maximum(number1, number2, number3);
		
		//display maximum value.
		System.out.println("Maximum is: " + result);
	}
	
	public static double maximum(double x, double y, double z)
	{
		double maximumValue = x;
		
		if(y > maximumValue)
			maximumValue = y;
		
		if(z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
		
	}
}
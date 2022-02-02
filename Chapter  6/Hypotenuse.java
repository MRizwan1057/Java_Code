

import java.security.SecureRandom;
public class Hypotenuse
{
	public static void main(String[] args)
	{
		// creating object
		SecureRandom randomNumbers = new SecureRandom();
		double base = 1 + randomNumbers.nextInt(11);
		double height = 1 + randomNumbers.nextInt(21);
		double hypotenuse = isHypotenuse(base, height);
		System.out.printf(" Base value: %.2f %n Height value: %.2f %n", base, height);
		System.out.printf("  Hypotenuse is : %.2f %n ",hypotenuse);
	}
	
	public static double isHypotenuse(double base, double height)
	{
		//double hypotenuse = Math.sqrt(base * base + height * height);
		double hypotenuse =	Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
		return hypotenuse;
	}
	
	
}
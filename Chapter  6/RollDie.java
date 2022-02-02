

import java.security.SecureRandom;

public class RollDie
{
	public static void main(String[] args)
	{
		//creating object
		SecureRandom randomNumbers = new SecureRandom();
		
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		
		// totally counts for 6000000; rolls of a die.
		for(int roll = 1; roll <= 6000000; roll++)
		{
			int face = 1 + randomNumbers.nextInt(6);
			
			// use face vale 1-6 to determine which counter to increment.
			switch (face)
			{
				case 1:
					++frequency1;
					break;
				case 2:
					++frequency2;
					break;
				case 3:
					++frequency3;
					break;
				case 4:
					++frequency4;
					break;
				case 5:
					++frequency5;
					break;
				case 6:
					++frequency6;
					break;
			}			
		}
	
		System.out.println("Face \t Frequency");// output headers
		System.out.printf(" 1 \t %d %n 2 \t %d %n 3 \t %d %n 4 \t %d %n 5\t %d %n 6 \t %d %n",
		frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
	}
}
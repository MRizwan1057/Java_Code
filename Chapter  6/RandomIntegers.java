

import java.security.SecureRandom; // program uses class SecureRandom.

public class RandomIntegers
{
	public static void main(String[] args)
	{
		//Randon numbers object will produce secure random numbers.
		SecureRandom randomNumbers = new SecureRandom();
		
		// loop 20 times
		for(int counter = 1; counter <= 20; counter++)
		{
			// pick random integers from 1 to 6.
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d ", face);
			
			// if counter is divisible by 5, start a new line.
			if(counter % 5 == 0)
			System.out.println();
		}
	
	}
	
}
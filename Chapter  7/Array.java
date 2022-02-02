
//import java.util.*;
import java.security.SecureRandom;

public class Array
{
	public static void main(String[] args)
	{
		SecureRandom randomNumbers = new SecureRandom();
		int size = 5;
		int[] a = new int[size];
		int[] b = new int[size];
		int[] c = new int[size];
		
		System.out.printf("Sum of Arrays Elements is as below : %n%n");

		for(int count = 0; count < a.length; ++count)
		{
			
			a[count] = 1+ randomNumbers.nextInt(50);
			b[count] = 50+ randomNumbers.nextInt(51);
			c[count] = a[count] + b[count];
			//System.out.printf("a: %d %n %n b: %d %n%n",a[count], b[count]);
			System.out.printf(" %d :   %d %n", count,c[count]);				
		}
			//System.out.println(Arrays.toString(c));
	}
}
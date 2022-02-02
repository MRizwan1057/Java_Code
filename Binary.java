// Question 4.31
import java.util.Scanner;
import java.lang.Math;
public class Binary
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Binary Number :");
		int binary = input.nextInt();
		int decimal = 0;
		int t = 2;
		int count = 0;
		while(binary>0)
		{
			decimal += (binary%10) * Math.pow(t,count);
			binary /= 10;
			count++;
		}
		System.out.print(decimal);
	}
}
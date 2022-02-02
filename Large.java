// Qustion 4.22
import java.util.Scanner;
public class Large
{
	public static void main (String[]args)
	{	
		int large=0;
		Scanner input = new Scanner(System.in);
		
		  System.out.print("Enter the ten Numbers :");
		for(int count=1; count<=10; count++)
		{
					 count = input.nextInt();
					 
			if(count>=10)
			 {
				large=count;
			 }
			System.out.printf("%s Largest Number is :", large);
		}
	}
}
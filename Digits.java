// spacing between digits of a number

import java.util.Scanner;
public class Digits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int Spaces;
		
		System.out.print("enter a five-digit number: ");
		Spaces= input.nextInt();
		
		System.out.printf("%d%s",(Spaces/10000),"   ");
		Spaces = Spaces % 10000;
		System.out.printf("%d%s",(Spaces/1000),"   ");
		Spaces = Spaces % 1000;
		System.out.printf("%d%s",(Spaces/100),"   ");
		Spaces = Spaces % 100;
		System.out.printf("%d%s",(Spaces/10),"   ");
		Spaces = Spaces % 10;
		System.out.print(SpacesD);
		
		
		
		
		
		
		
	}
}
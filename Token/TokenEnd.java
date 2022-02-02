// Question 14.14
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenEnd
{
	public static void main(String[]args)
	{
		// get sentence
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a sentence and press Enter");
		String sentence = scanner.nextLine();

		// process user sentence
		String[] tokens = sentence.split(" ");
			System.out.printf("Number of elements: %d%nThe tokens are:%n%n",tokens.length);
		for (String token : tokens) 
				System.out.println(token);
			System.out.println();
			
		for (String token : tokens) 
		{
			if(token.endsWith("ed"))
			System.out.printf("\"%s\" ends with \"ed\"%n", token);
		}
	}
}
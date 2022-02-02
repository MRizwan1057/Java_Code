// Question 14.9: Token.java
// StringTokenizer object used to tokenize strings and print tokens in reverse hieracrchly
import java.util.Scanner;
import java.util.StringTokenizer;

public class Token 
{
	public static void main(String[] args)
	{
		// get sentence
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a sentence and press Enter");
		String sentence = scanner.nextLine();

		// process user sentence
		String[] tokens = sentence.split(" ");
			System.out.printf("Number of elements: %d%nThe tokens are:%n",tokens.length);
		for (String token : tokens) 
			System.out.println(token);
		
		//Reverse printing
		StringBuilder stringBuilder = new StringBuilder();
		for (int j = tokens.length-1; j >= 0; j--)
			{
			stringBuilder.append(tokens[j]).append(' ');
			}
			System.out.println("Reverse words: " + stringBuilder);
	}
} // end class Token
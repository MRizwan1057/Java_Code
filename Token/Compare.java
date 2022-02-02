// Question 14.4

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {

        // prompted user input
          Scanner input = new Scanner(System.in);
            int firstIndex;
            int secondIndex;

            System.out.print("Enter First String:"); // prompt 
                String s1 = input.next(); // assigns s1 to user input
            System.out.print("Enter Second String:"); // prompt
                String s2 = input.next(); // assigns s2 to user input


            System.out.print("Enter Starting Index for First String:"); // prompt
                 firstIndex = input.nextInt(); // assigns firstIndex to user input
				 
            System.out.print("Enter Starting Index for Second String:"); // prompt
                 secondIndex = input.nextInt(); // assigns secondIndex to user input
				 
            System.out.print("Enter Number of Characters to be Compared:"); // prompt
                int numberCompared = input.nextInt(); // assigns numberCompared to user input
				
			// test for equality ignore case
			if(s1.equalsIgnoreCase(s2))//true
				System.out.printf("%s equals %s wiht case ignore%n",s2,s1);
			else
				System.out.printf("s1 does not equal s2%n");
			
			//test compareTo
			System.out.printf(
				"%ns1.compareTo(s2) is %d", s1.compareTo(s2));
			
				
            // boolean results = s1.regionMatches(firstIndex,s2, secondIndex, numberCompared);   

            // if (results)
                // System.out.println(true);
            // else
                // System.out.println(false);
    }
}
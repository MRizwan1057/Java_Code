
// low level Simpletron Machine Language (S.M.L)
import java.util.Scanner;

public class SimpletronCommandLine 
{
	private int accumulator;
	private int [] memory;	
	private int instructionRegister;	 
	private int instructionCounter = 0;
	private int operationCode;
	private int operand;
	private int initialiseVariables;
	
	//int[] memory = new int[100];

	public static void main(String[] args){
		for (int i = 0; i < args.length; i++)
			//System.out.println(args[i]);
			memory[i] = Integer.parseInt(args[i]);
				//memory = new int [100];	
		//instructionCounter = 0;
	}	
	public void load ( ) 
	{
		operationCode = memory [ instructionCounter ] / 100;
		operand = memory [ instructionCounter ] % 100;

	}

	public void execute (int operands, int operation ) 
	{
		switch ( operation ) 
		{
			case 10: 
				Scanner input = new Scanner ( System.in );
				System.out.print ( "Please Enter a whole number (positive or negative): " );
				memory [ operands ] = input.nextInt ();
				break;
			case 11:
				System.out.println ("The result of the operation is " + memory [ operands] );
				break;
			case 20:
				accumulator = memory [ operands ];
				break;
			case 21: 
				memory [ operands ] = accumulator;
				break;
			case 30: 
				accumulator += memory [ operands ];
				break;
			case 31:
				accumulator -= memory [ operands ];
				break;
			case 32:
				accumulator /=  memory [ operands ];
				break;
			case 33:
				accumulator *= memory [ operands ];
				break;
			case 40:
				instructionCounter = operands;
				break;
			case 41:
				if ( accumulator < 0 )
					instructionCounter = operands;
				break;
			case 42:
				if ( accumulator == 0 )
					instructionCounter = operands;
				break;
			case 43: 
				dumpTheCore ();	
				System.out.printf ("\n%s\n", "The program has ended...");
				System.exit ( 0 );
				break;

		}	 

		instructionCounter++;
	}	 
	public void dumpTheCore ( )
	{
		System.out.printf ("\n%30s\n%30s\t%s%4d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n\n%30s\n", "REGISTERS:", 
				"accumulator", "+", accumulator, "instruction counter", instructionCounter, "instruction register",
			       	instructionCounter, "operation code", operationCode, "operand", operand, "MEMORY:" );
		for ( int i = 0; i < 10; i++ )
		{
			System.out.printf ( "%6d", i);
		}
		System.out.println ();
		int counter = 0;
		for (int i = 0; i < 10; i++ ) 
		{
			if ( counter %10 == 0 )
				System.out.printf ("%2d ", counter);
			for (int j = 0; j < 10; j++) 
			{
				if ( memory [ counter ] == 0 )
					System.out.printf ( "%s%s", "+", "0000 ");
				else 
					System.out.printf ("%s%4d ", "+", memory [counter]);
				counter++;

			}
		       
				System.out.println ();	

			}	
		}
}
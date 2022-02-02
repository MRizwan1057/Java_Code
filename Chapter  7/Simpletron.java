import java.util.Scanner;

public class Simpletron
{
	
	private static final int READ = 10;
	private static final int WRITE = 11;
	private static final int LOAD = 20;
	private static final int STORE = 21;
    private static final int ADD = 30;	
    private static final int SUBTRACT = 31;	
    private static final int DIVIDE  = 32;
    private static final int MULTIPLY = 33;	
    private static final int BRANCH = 40;	
    private static final int BRANCHNEG = 41;	
	private static final int BRANCHZERO = 42;
	private static final int HALT = 43;
	
	
	    private static int accumulator = 0;
	    private static int instructionCounter = 0;
	    private static int instructionRegister = 0;
	    private static int operend = 0;
	    private static int opCode = 0;
	
	public static void main(String[] args)
	{
		
        
		int memory[] = new int[100];
		int instCode = 0;
		
	  //  Scanner sc = new Scanner(System.in);

		
		// for(int j = 0; j < memory.length; j++){
		// System.out.printf("%02d ? ", j);
		// int input = sc.nextInt();
			// if(input == -99999)
				// break;
        	// memory[j] = input;
		//}
		// using command line arguements intead of prompt
		for(int x = 0; x < args.length; ++x)
		{
			memory[x] = Integer.parseInt(args[x]);
		}
		
		while(instructionCounter < memory.length)
		{
		    	
		
            			
		//instCode = sc.nextInt();
		instructionRegister = memory[instructionCounter];
	
	    opCode = instructionRegister / 100;
		//System.out.println(opCode);
		operend = instructionRegister % 100;
		//System.out.println(operend);
		instructionCounter++;
		
		
		
		System.out.printf("Registers : %n Accumulator : %04d %n InstructionCounter :%02d %n InstructionRegister : %04d %n OpCode :%2d %n Operand %2d %n %n",
		accumulator, instructionCounter -1, instructionRegister, operend, opCode);
		
	
		switch(opCode)
		{
			case READ:
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Instruction value");
				memory[operend] = input.nextInt();
			    System.out.println(memory[operend]);
				//break;
            case WRITE:
				System.out.println("The result of the operation is " + memory[opCode]);			
			    break;
			case LOAD:
			    accumulator = memory[operend];
				break;
			case STORE:
			    memory[operend] = accumulator;
				break;
			case ADD:
			    accumulator += memory[operend];
				break;
			case SUBTRACT:
			    accumulator -= memory[operend];
				break;
			case DIVIDE:
			    accumulator /= memory[operend];
				break;
			case MULTIPLY:
			    accumulator *= memory[operend];
				break;
			case BRANCH:
			    instructionCounter = operend;
				break;
			case BRANCHNEG:
			    if(accumulator < 0)
			       instructionCounter = operend;
				   break;
			case BRANCHZERO:
			    if(accumulator == 0)
			       instructionCounter = memory[operend];
				    break;
			case HALT: 
			//	dumpTheCore ();	
				System.out.printf ("\n%s\n", "The program has ended...");
				for(int i = 0; i < memory.length; i++){
					if(i % 10 == 0)
						System.out.println();
		        System.out.printf("%s%04d ","+",memory[i]);
				}
				System.exit ( 0 );
				break;
			    
		    }
		}
		
	}   
}		
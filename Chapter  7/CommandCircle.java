// import java.lang.Iterable;
public class CommandCircle

{ 
	public static void main(String args[]) 
		{ 
			int[] memory = new Integer.parseInt(args[0]);
				
			for (int x = 0; x < args.length; x++)
			{
				memory[x] = args[x];
				
				System.out.println(memory[x]);
			}
			System.out.println(memory);
		}
}	
	
	
	
	
	
	
	
	// int i;
		// for ( i= 0; i < args.length; i++)
			// System.out.println(args[i]);
			// memory[i][] = Integer.parseInt(args[i]);
			// System.out.println(memory[i]);
			// for(int arg: args[i]){
				// System.out.println(arg);
			// }

		// int r1=Integer.parseInt(args[0]); 
		// int	area1 = 22/7 * r1 * r1; 
		// int circumference1 = 2 * 22/7 * r1;

		// int r2=Integer.parseInt(args[1]); 
		// int area2 = 22/7 * r2 * r2; 
		// int circumference2 = 2 * 22/7 * r2;
		
		// int r3=Integer.parseInt(args[2]); 
		// int area3 = 22/7 * r3 * r3; 
		// int circumference3 = 2 * 22/7 * r3;
		
		
		//finding average 
			// System.out.printf("average of total area is : %.2f%n", ((double)area1+area2+area3)/args.length);
			// System.out.printf("average of total area is : %.2f%n", ((double)circumference1+circumference2+circumference3)/args.length);
	
		// for(int i = 0; i < args.length; ++i)
		// {
			// int value[i] = Integer.parseInt(args[i]);
			// System.out.printf("%d",i);
		// }
	
	//} 
//} 
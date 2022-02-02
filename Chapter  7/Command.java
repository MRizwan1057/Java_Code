public class Command
{	
	public static void main (String[] args)
	{
			
				
		Command[] circle = new Command[args.length];
		for(int x = 0; x < args.length; x++)
		{
			System.out.println(args[x]);
			
			circle[x] = new Command(Integer.parseInt(args[x]));
			System.out.println(circle[x]*circle[x] * 22/7); //isi tareeka sa baki bhi print krny hain
			System.out.println(circle[x] * 2 * 22/7);
			 
		}
			System.out.println(circle[x]); 
			//System.out.println(Ce.getCircumAverage(circle));		
				
				
		/* int r1=Integer.parseInt(args[0]); 
		int	area1 = 22/7 * r1 * r1; 
		int circumference1 = 2 * 22/7 * r1;
			System.out.printf("Area of r1:%d \t Circum of r1: %d%n", area1, circumference1);
		int r2=Integer.parseInt(args[1]); 
		int area2 = 22/7 * r2 * r2; 
		int circumference2 = 2 * 22/7 * r2;
		System.out.printf("Area of r2:%d \t Circum of r2: %d%n", area2, circumference2);
		int r3=Integer.parseInt(args[2]); 
		int area3 = 22/7 * r3 * r3; 
		int circumference3 = 2 * 22/7 * r3;
		System.out.printf("Area of r3:%d \t Circum of r3: %d%n", area3, circumference3);
		 */// display Area and Circumference.
		
		
		//finding average 
			// System.out.printf("%n Average of total area is : %.2f%n", ((double)area1+area2+area3)/args.length);
			// System.out.printf("%n Average of total area is : %.2f%n", ((double)circumference1+circumference2+circumference3)/args.length);
	
	
	} 
}
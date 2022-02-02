
import java.util.Scanner;
public class Namaz
{
	public static void main(String[] args)
	{
	int salahCounter = 0 ;
	int total = 0 ;
	int fajar = 0 ;
	int zuhar = 0 ;
	int asar = 0 ;
	int maghrib = 0 ;
	int esha = 0 ;
	int namaz;
	int sum = 0;
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("plaese enter salah index between 1 to 5 : ");
	
	while(input.hasNext())
	{
		namaz = input.nextInt();
	
		if (namaz > 0 && namaz < 6)
		
			salahCounter ++;
		
		switch(namaz)
		{
		
			case 1:
				fajar +=2;
				break;
		
			case 2:
				zuhar +=4;
				break;
		
			case 3:
				asar +=4;
				break;

			case 4:
				maghrib +=3;
				break;
		
			default:
				
				if (namaz > 0 && namaz < 6)
		
				esha +=4;
				break;
		}
		
		
	}
	System.out.printf("Total salah entered by user is: %d %n", fajar + zuhar +  asar 
		+ maghrib + esha);
		System.out.printf("Average salah offerred by user is : %.2f %n",(float)(fajar + zuhar +  asar 
		+ maghrib + esha)/salahCounter);
}
}
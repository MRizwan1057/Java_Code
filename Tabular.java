// Question 4.21
public class Tabular
{
	public static void main (String[]args)
	{
		for(int count=1; count<=5; count++)
		{
			System.out.printf("%d%s%d%s%d%s%d%n",count, "	", count*count, "	",
			count*count*count, "	", count*count*count*count);
			
		}
	}
}
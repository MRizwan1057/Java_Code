public class Asay
{
	public static void main(String[] args)
	{
		//int [] radius = new int [args.length];
				
		for(int i = 0; i < args.length; ++i)
		{
			 radius [i] = Integer.parseInt(args[i]);
		
			int [] area  = 3.14 *  radius[i]*2;
			int [] circum = 2 * 3.14 * radius[i];
			System.out.printf("%d %n %d %n",area[i], circum[i]);
		}
	}
}
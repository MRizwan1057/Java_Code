public class CeTest
{
	public static void main(String[] args)
	{
		Ce[] circle = new Ce[args.length];
		for(int x = 0; x < args.length; x++){
			System.out.println(args[x]);
			
			circle[x] = new Ce(Integer.parseInt(args[x]));
			System.out.println(circle[x].getArea()); //isi tareeka sa baki bhi print krny hain
			System.out.println(circle[x].getCircum());
			 
		}
			System.out.println(Ce.getAreaAverage(circle)); 
			System.out.println(Ce.getCircumAverage(circle));
	}
}
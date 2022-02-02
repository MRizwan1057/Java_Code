

public class Time2Tested
{
	public static void main(String[] args)
	{
		Time2d t1 = new Time2d();
		Time2d t2 = new Time2d(5);
		Time2d t3 = new Time2d(11, 33);
		Time2d t4 = new Time2d(12, 32, 22);
		Time2d t5 = new Time2d(t4);
		
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		
		try 
		{
			Time2d t6 = new Time2d(27,76, 88);
			
		}
		catch (IllegalArgumentException e)
		{
			System.out.printf("%n Exception while initializing t6: %s %n", e.getMessage());
		}
		

	}	
		private static void displayTime(String header, Time2d t)
		{
			System.out.printf("%s%n %s%n %s%n", header, t.toUniversalStirng(), t.toString());
		}
		
		
}


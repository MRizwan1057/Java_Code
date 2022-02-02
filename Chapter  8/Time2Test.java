

public class Time2Test
{
	public static void main(String[] args)
	{
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(11, 33);
		Time2 t4 = new Time2(12, 32, 22);
		Time2 t5 = new Time2(t4);
		
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		
		try 
		{
			Time2 t6 = new Time2(27,76, 88);
			
		}
		catch (IllegalArgumentException e)
		{
			System.out.printf("%n Exception while initializing t6: %s %n", e.getMessage());
		}
	
	
	
			t4.tick();
			displayTime("t4: t4 after 1 second increase", t4);
			t4.incrementMinute();
			displayTime("t4: t4 after adding 1 minute", t4);
			t4.incrementHour();
			displayTime("t4: t4 after adding 1 hour", t4);
			t5.tick();
		  	displayTime("t5: t4 after 1 second increase", t5);
			t5.incrementMinute();
			displayTime("t5: t5 after adding 1 minute", t5);
			t5.incrementHour();
			displayTime("t5: t5 after adding 1 hour", t5);
	
	}
		private static void displayTime(String header, Time2 t)
		{
			System.out.printf("%s%n %s%n %s%n", header, t.toUniversalStirng(), t.toString());

		}
}
		
		



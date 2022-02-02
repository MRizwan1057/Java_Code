public class Time1Test
{
	public static void main(String[] args)
	{
		// create and initialize a Time1 object.
		Time1 time = new Time1(); // invoking constructor
		// output string representation of the time
		displayTime("After time object is created", time);
		System.out.println();
		
		// change time and display update time
		time.setTime(13, 27,6);
		displayTime("After calling setTime", time);
		System.out.println();
		
		// attempt to set time with invalid values.
		
		try 
		{
			time.setTime(99, 99, 99);
		}
		catch (IllegalArgumentException e)
		{
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		// display time to set invalid values
		displayTime("After calling setTime with invalid values", time);
	}
	
	// display a Time1 object in 24-hour and 12-hour formates.
	private static void displayTime(String header, Time1 t)
	{
	System.out.printf("%s %n Universal time: %s %n Standard time : %s %n", header, t.toUniversalString(), t.toString());
	}
}
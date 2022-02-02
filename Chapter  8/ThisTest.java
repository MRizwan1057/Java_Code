

public class ThisTest
{
	public static void main(String[] args)
	{
		SimpleTime time = new SimpleTime(15, 30,19);
		System.out.println(time.buildString());
	}
}// end class ThisTest

// class SimpleTime demonstrates "this" reference

class SimpleTime
{
	private int hour;
	private int minute;
	private int second;
	
	
	// if the constructor uses parameter names identical to 
	// instance variable names the "this" reference is 
	// required to distinguish between the names
	public SimpleTime(int hour, int minute, int second)
	{
	
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	// use explicit and implicit "this" to call toUniversalString.
	public String buildString()
	{
		return String.format("%24s: %s%n%24s: %s",
		"this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
		
	}
	
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString()
	{
		// "this" is not required here to access instance variables, 
	// because method does not have local variables with same 
	// names as instance variables
	return String.format("%02d:%02d:%02d",
	this.hour, this.minute, this.second);
	}
	
}// end class SimpleTime
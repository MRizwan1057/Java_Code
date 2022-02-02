
public class Time2d
{	
	private int totalSeconds;
	
	// Time2 no-argument constructor: 
	 //initializes each instance variable to zero
	 public Time2d()
	 {
		 this(0, 0, 0); // invoke constructor with three argument
	 }
	
	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2d(int hour)
	{
		this(hour, 0, 0);
	}
	public Time2d(int hour, int minute)
	{
		this(hour, minute, 0);
	}
	
	public Time2d(int hour, int minute, int second)
	{
		
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");

		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");

		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");

		this.totalSeconds=hour*3600 + minute*60 + second;
	
	}
	// Time2 constructor: another Time2 object supplied
	public Time2d(Time2d time)
	{
		// invoke constructor with three arguments 
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	// Set Methods
	// set a new time value using universal time; 
	// validate the data
	public void setTime(int hour, int minute, int second)
	{
	   	if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60)

			this.totalSeconds = hour*3600 + minute*60 + second;
		 
	}	
	
	// validate and set hour
	public void setHour(int hour)
	{
		if (hour > 0 || hour < 24)
			totalSeconds = (hour * 3600) + (getMinute() * 60) + getSecond();
	}
	// validate and set minute
	public void setMinute(int minute)
	{
		if (minute > 0 || minute < 60)
			totalSeconds = (getHour() * 3600) + (minute * 60) + getSecond();
	}
	// validate and set second
	public void setSecond(int second)	
	{
		if (second > 0 || second < 60)
			totalSeconds = (getHour() * 3600) + (getMinute() * 60) + second;
	}
		
	// Get methods 
	// get hour value
	public int getHour()
	{
		return (totalSeconds / 3600);
	}
	// get minute value
	public int getMinute()
	{
		return ((totalSeconds % 3600) / 60);
	} 
	
	// get second value
	public int getSecond()
	{
		return ((totalSeconds % 3600) % 60);
	}
	// convert to String in universal-time format(HH:MM:SS)

	public String toUniversalStirng()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}	
	
	public String toString()
	{
		return String.format("%d:%02d:%02d: %s",
		((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}
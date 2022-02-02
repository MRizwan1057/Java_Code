public class TimeAndDate {

	private static Date date = new Date(17, 07, 1999);
	private static TickTime time = new TickTime();
	
	public static void displayDateAndTime () {
		System.out.printf("Date: %s, Time: %s%n",date,time);
	}
	
	public static void main(String[] args) {
		
		displayDateAndTime();
		
		for (int i=0;i<510;i++) {//Print the date and time after 500 hours
		time.incrementHour();
		System.out.print("The time after one hour is:");
		displayDateAndTime();
		}
		
	}
}


//Fig. 8.5: Time2.java
	//Time2 class declaration with overloaded constructors.  

	class TickTime
	{
	   private int hour;//0-23
	   private int minute;//0-59
	   private int second;//0-59

	  //Time2 no-argument constructor: 
	  //initializes each instance variable to zero
	   public TickTime()
	   {
	      this(0, 0, 0);//invoke constructor with three arguments
	   } 
	   
	//Custom time class
	   public TickTime(int secondsPassed){
		   if (secondsPassed<=0){
			   throw new IllegalArgumentException("The number of elapsed seconds cannot be negative!");
		   }
		   
		   this.second=secondsPassed%60;
		   this.minute=secondsPassed/60%60;
		   this.hour=(secondsPassed/60/60%60>=24)?0:secondsPassed/60/60%60;
	   }
	   
	   public TickTime(int hour, int minute, int second) 
	   { 
	      if (hour <0 || hour >= 24)
	         throw new IllegalArgumentException("hour must be 0-23");

	      if (minute <0 || minute >= 60)
	         throw new IllegalArgumentException("minute must be 0-59");

	      if (second <0 || second >= 60)
	         throw new IllegalArgumentException("second must be 0-59");

	      this.hour = hour;
	      this.minute = minute; 
	      this.second = second; 
	   } 

	  //Time2 constructor: another Time2 object supplied
	   public TickTime(TickTime time)
	   {
	     //invoke constructor with three arguments
	      this(time.getHour(), time.getMinute(), time.getSecond());
	   } 

	  //Set Methods
	  //set a new time value using universal time; 
	  //validate the data
	   public void setTime(int hour, int minute, int second)
	   {
	      if (hour <0 || hour >= 24)
	         throw new IllegalArgumentException("hour must be 0-23");

	      if (minute <0 || minute >= 60)
	         throw new IllegalArgumentException("minute must be 0-59");

	      if (second <0 || second >= 60)
	         throw new IllegalArgumentException("second must be 0-59");

	      this.hour = hour;
	      this.minute = minute; 
	      this.second = second; 
	   } 

	  //validate and set hour 
	   public void setHour(int hour) 
	   { 
	      if (hour <0 || hour >= 24)
	         throw new IllegalArgumentException("hour must be 0-23");

	      this.hour = hour;
	   } 

	  //validate and set minute 
	   public void setMinute(int minute) 
	   { 
	      if (minute <0 || minute >= 60)
	         throw new IllegalArgumentException("minute must be 0-59");

	      this.minute = minute; 
	   } 

	  //validate and set second 
	   public void setSecond(int second) 
	   { 
	      if (second <0 || second >= 60)
	         throw new IllegalArgumentException("second must be 0-59");

	       this.second = second; 
	   } 

	  //Get Methods
	  //get hour value
	   public int getHour() 
	   { 
	      return hour; 
	   } 

	  //get minute value
	   public int getMinute() 
	   { 
	      return minute; 
	   } 

	  //get second value
	   public int getSecond() 
	   { 
	      return second; 
	   } 

	  //convert to String in universal-time format (HH:MM:SS)
	   public String toUniversalString()
	   {
	      return String.format(
	         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	   } 

	  //convert to String in standard-time format (H:MM:SS AM or PM)
	   public String toString()
	   {
	      return String.format("%d:%02d:%02d %s", 
	         ((getHour() == 0 || getHour() == 12)? 12: getHour()% 12),
	         getMinute(), getSecond(), (getHour() <12? "AM": "PM"));
	   } 
	   
	//Add one second
	   public void tick(){
		   if(second+1<60)		   
			   second++;
		   else if (second+1==60){
			   second=0;
			   this.incrementMinute();
		   }
	   }
	   
	//Add one minute
	   public void incrementMinute(){
		   if(minute+1<60)		   
			   minute++;
		   else if (minute+1==60){
			   minute=0;
			   this.incrementHour();
		   }
	   }
	   
		//Add one hour
	   public void incrementHour(){
		   if(hour+1<24)		   
			   hour++;
		   else if (hour+1==24)
		   {
			   hour=0;
			   Date(testDate.nextDay());
			   
		   }
	   }
	   
	}//end class Time2



 // Exercise 8.8 Solution: Date.java
 // Date class declaration.

  class Date
 {
	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // > 0

	// constructor: call checkMonth to confirm proper value for month; 
	// call checkDay to confirm proper value for day
	public Date( int theDay, int theMonth, int theYear )
	{
		month = checkMonth( theMonth ); // validate month
		year = checkYear( theYear ); // validate year
		day = checkDay( theDay ); // validate day

		System.out.printf(
		"Date object constructor for date %s\n", toString() );
	 } // end Date constructor

 // utility method to confirm proper year value
	private int checkYear( int testYear )
	{
		if ( testYear > 0 ) // validate year
			return testYear;
		else // day is invalid
			{
				System.out.printf(
				"Invalid year (%d) set to 1.\n", testYear );
			return 1;
			} // end else
	} // end method checkYear

 // utility method to confirm proper month value
	private int checkMonth( int testMonth )
	{
		if ( testMonth > 0 && testMonth <= 12 ) // validate month
			return testMonth;
		else // month is invalid
		{
			System.out.printf(
			"Invalid month (%d) set to 1.\n", testMonth );
			return 1; // maintain object in consistent state
		} // end else
 } // end method checkMonth

	// utility method to confirm proper day value based on month and year
	private int checkDay( int testDay )
	{
		int daysPerMonth[] =
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


	// check if day in range for month
	if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
		return testDay;

	// check for leap year
	if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
		( year % 4 == 0 && year % 100 != 0 ) ) )
			return testDay;
	else	
		System.out.printf( "Invalid day (%d) set to 1.\n", testDay );

			return 1; // maintain object in consistent state
 } // end method checkDay

 // increment the day and check if doing so will change the month
	public void nextDay()
	{
		int testDay = day + 1;
		if ( checkDay( testDay ) == testDay )
			day = testDay;
		else
		{
		 day = 1;
		 nextMonth();
		} // end else
 } // end method nextDay

 // increment the month and check if doing so will change the year
	public void nextMonth()
	{
	 if ( 12 == month )
		 year++;

		month = month % 12 + 1;
	} // end method nextMonth

	
	public void nextYear()
	{
		year++;
	}
  
 // return a String of the form month/day/year
	public String toString()
	{
		return String.format( "%d/%d/%d", day, month, year ); 
	} // end method toDateString
 } // end class Date
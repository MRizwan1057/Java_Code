 // Exercise 8.8 Solution: Date.java
 // Date class declaration.

 public class Date
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
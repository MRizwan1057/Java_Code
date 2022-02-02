 // Exercise 8.8 Solution: DateTest
 // Program tests Date class.

 public class DateTest
 {
	// method main begins execution of Java application
	public static void main( String args[] )
	{
		System.out.println( "Checking increment" );
		Date testDate = new Date( 32, 07, 1999 );
	// test incrementing of day, month and year
		for ( int counter = 0; counter < 20; counter++ )
		{
			//testDate.nextDay();
			//testDate.nextMonth();
			testDate.nextYear();
			System.out.printf( " After Incremented: %s\n\n",
			testDate.toString());
		} // end for
	} // end main
 } // end class DateTest

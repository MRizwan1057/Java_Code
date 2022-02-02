
	public class TickTimeTest 
	{
	   public static void main(String[] args)
	   {
	      TickTime t1 = new TickTime();//00:00:00
	      TickTime t2 = new TickTime(2);//The number of seconds after zero (less than 1 day-86400 seconds)
	      TickTime t3 = new TickTime(610);//The number of seconds after zero (any number of seconds)
	      TickTime t4 = new TickTime(12, 59, 40);//12:59:40
	      TickTime t5 = new TickTime(23, 59, 59);//23:59:59

	      System.out.println("Constructed with:");
	      displayTime("t1: all default arguments", t1);
	      displayTime("t2: Calculate hours, minutes and seconds after passing the zero point (less than 1 day-86400 seconds)", t2);
	      displayTime("t3: Calculate hours, minutes, and seconds through seconds (arbitrary number of seconds) after the zero point", t3);
	      displayTime("t4: hour, minute and second specified", t4);
	      displayTime("t5: Time2 object t4 specified", t5);

			t4.tick();
			displayTime("t4: t4 after 1 second increase", t4);
			t4.incrementMinute();
			displayTime("t4: t4 after adding 1 minute", t4);
			t4.incrementHour();
			displayTime("t4: t4 after adding 1 hour", t4);
			// t5.tick();
		  	// displayTime("t5: t4 after 1 second increase", t5);
			// t5.incrementMinute();
			// displayTime("t5: t5 after adding 1 minute", t5);
			// t5.incrementHour();
			// displayTime("t5: t5 after adding 1 hour", t5);

	     //attempt to initialize t6 with invalid values
	      try
	      {
	         TickTime t6 = new TickTime(27, 74, 99);//invalid values
	      } 
	      catch (IllegalArgumentException e)
	      {
	         System.out.printf("%nException while initializing t6: %s%n",
	            e.getMessage());
	      } 
	   } 

	  //displays a Time2 object in 24-hour and 12-hour formats
	   private static void displayTime(String header, TickTime t)
	   {
	      System.out.printf("%s%n %s%n %s%n",
	         header, t.toUniversalString(), t.toString());
	   } 
	   

	   
	}//end class Time2Test
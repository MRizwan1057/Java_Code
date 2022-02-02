public class DateAndTime {

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
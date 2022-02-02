 public class Time3Test 
{
    public static void main(String[] args)
    {
        Time3 t1 = new Time3(); //00:00:00
        Time3 t2 = new Time3(2); //02:00:00 
        Time3 t3 = new Time3(21, 34); //21:34:00
        Time3 t4 = new Time3(12, 25, 42); //12:25:42
        Time3 t5 = new Time3(t4); //12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; defaults for minute and second", t2);
        displayTime("t3: hour and minute supplied second defaulted", t3);
        displayTime("t4: hour minute and second supplied", t4);
        displayTime("t5: Time2 object t4 specified", t5);
        //attempt to initialize t6 with invalid args
        try
        {
            Time3 t6 = new Time3(27,74,99); //all invalid values
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n",
                    e.getMessage());
        }


        System.out.println("Time before increment minute method");
        System.out.printf("%s\n", t4.toString());

        t4.Tick();
		System.out.println("Time after increment minute method");
        System.out.printf("%s\n", t4.toString());

		t4.incrementMinute();
		System.out.println("Time after increment minute method");
        System.out.printf("%s\n", t4.toString());

        t4.incrementHour();
		System.out.println("Time after increment minute method");
        System.out.printf("%s\n", t4.toString());

	
		
		
            }
    //display Time2 object in 24 hour and 12 hour formats
    private static void displayTime(String header, Time3 t)
    {
        System.out.printf("%s%n   %s%n   %s%n", header, t.ToUniversalString(),
                t.toString());
    }
}



public class MemberAccessTest
{
	public static void main(String[] args)
	{
		Time1 time = new Time1();
	
		time.hour = 7; //error; hour has private access in Time1'
		time.minute = 15; // = =
		time.second = 30; // = =
	}
}
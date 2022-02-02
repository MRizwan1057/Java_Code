public class Time3
 {
    private int totalseconds;
    //no argument constructor
    public Time3()
    {
        this(0,0,0); //invoke constructor with three arguments default to 0
    }

    //constructor with hour supplied minute and second default to 0
    public Time3(int hour)
    {
        this(hour, 0, 0); //invoke constructor with 3 args
    }

    //constructor with hour and minute supplied seconds default to 0
    public Time3(int hour, int minute)
    {
        this(hour, minute, 0); //invoke constructor with 3 args
    }

    //Time2 constructor with hour minute and second supplied also tests

    public Time3(int hour, int minute, int second)
    {       
        this.totalseconds = (hour * 3600);
        this.totalseconds += (minute * 60);
        this.totalseconds += (second);
    }

    public Time3(Time3 time)
    {
        //invoke constructor with 2 args
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // SET and GET methods start here, also Universal time conversion and check
    public void setTime(int hour, int minute, int second) 
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23");
        if (minute < 0 || minute >= 59)
            throw new IllegalArgumentException("Minute must be 0-59");
        if (second < 0 || second >= 59)
            throw new IllegalArgumentException("Hour must be 0-59");

         this.totalseconds = (hour * 3600);
         this.totalseconds += (minute * 60);
         this.totalseconds += second;
    }

    //validate and set hour
    public void setHour(int hour)
    {
        if (hour < 0 || hour >= 23)
            throw new IllegalArgumentException("Hour must be 0-23");
        this.totalseconds = (hour * 3600);
    }

    //validate and set minute
    public void setMinute(int minute)
    {
        if (minute < 0 || minute >= 59)
            throw new IllegalArgumentException("Minute must be 0-59");
        this.totalseconds += (minute * 60);
    }

    //validate and set second
    public void setSecond(int second)
    {
        if (second < 0 || second >= 59)
            throw new IllegalArgumentException("Second must be 0-59");
        this.totalseconds += second;
    }
    //Get Methods start here

    //Get hour
    public int getHour()
    {
        return totalseconds / 3600;
    }

    //get minute
    public int getMinute()
    {
        return (totalseconds - (3600 * getHour())) / 60;
    }

    //get second
    public int getSecond()
    {
        return totalseconds - (3600 * getHour())- (60 * getMinute());
    }


	//Assignment 1-2 tick methods start here.
    public void Tick()
    {
        //setSecond(totalseconds ++);
        if ((totalseconds % 3600 % 60 ) +1 < 59) 
			totalseconds++;
		else
			incrementMinute();
    }
    public void incrementMinute()
    {
        //setMinute( totalseconds ++);
        if (( totalseconds % 3600) + 1 < 59) 
				totalseconds=totalseconds % 3600 + 1; //+=1;
		else
			incrementHour();
    }
    public void incrementHour()
    {
       // setHour(totalseconds ++);
		if((totalseconds / 3600) + 1 < 24)
				totalseconds=totalseconds / 3600 + 1;//+=1;
		 
			 
    }
    //convert our string to universal format (HH:MM:SS)
    public String ToUniversalString()
    {
        return String.format(
        "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    //conver to standard format (H:MM:SS AM or PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",((getHour() == 0 || getHour() ==
        12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour()
        < 12 ? "AM" : "PM"));
    }

}//end class Time2


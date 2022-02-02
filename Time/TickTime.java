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
			   Date.nextDay();
		   }
	   }
	   
	}//end class Time2


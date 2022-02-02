// if...else statement.

public class Student1
{
	private String name;
	private double average;
	
	// constructor initializes instance variables
	
	public Student1(String name, double average)
	{
		this.name = name;
		
		//validate the average
		
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average;
	}
		//set and get methods
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setAverage(double studentAverage)
		{
			if (average > 0.0)
				if (average <= 100.0)
					this.average = average;
		}		
			
		public double getAverage()
		{
			return average;
		}		
		
		public String getLetterGrade()
		{
			String letterGrade = "";
			
			if (average >= 90.0) 
				letterGrade = "A"; 
			else if (average >= 80.0)
				letterGrade = "B"; 
			else if (average >= 70.0)
				letterGrade = "C"; 
			else if (average >= 60.0)
				letterGrade = "D"; 
			else 
				letterGrade = "F"; 
			
			return letterGrade;
	}	
}









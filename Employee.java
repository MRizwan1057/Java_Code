// Assignment #1  encoded by Muhammad Rizwan

// Employee.java
public class Employee
{
	private String firstname;
	private String lastname;
	public double mnthsalary;
	
	
	// initializing constructor with parameter name
	public Employee (String firstname, String lastname, double mnthsalary)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.mnthsalary = mnthsalary;
	}
	
	// providing set and get methods 
	
	// set name method
	public void setfirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	//method to get name
	public String getfirstname()
	{
	return firstname;
	}
	
	// set name method
	public void setlastname(String lastname)
	{
		this.lastname = lastname;
	}
	
	//method to get name
	public String getlastname()
	{
	return lastname;
	}
	// set name method
	public void setmnthsalary(double mnthsalary)
	{
		this.mnthsalary = mnthsalary;
	}
	
	//method to get name
	public double getmnthsalary()
	{
	return mnthsalary;

	}

	{
		if(mnthsalary <= 0)
			mnthsalary = 0;
	}

} // class Employee ended...


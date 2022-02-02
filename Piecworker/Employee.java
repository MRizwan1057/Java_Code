// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private Date birthDate;
	// constructor
	public Employee(String firstName, String lastName, 
	String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	} 
	
	// return first name
	public String getFirstName()
	{
		return firstName;
	} 
	
	// return last name
	public String getLastName()
	{
		return lastName;
	} 
	
	// return social security number
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	} 
	public void setBirthDate( Date newbday)
	{
		birthDate = newbday;
	}

	 public Date getBirthDate()
	 {
        return birthDate;
	 }
	// return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format("%s %s%nsocial security number: %s", 
		getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
	}
	
	// abstract method must be overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
	
	
	//public abstract double setbonus();
 // No implementation 
}  // end abstract class Employee
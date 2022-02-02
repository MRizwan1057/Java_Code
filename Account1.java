//Account1 with balance

public class Account1
{
	private String name;
	private double balance;
	
	// constructor with two parameters
	public Account1(String name, double balance)
	{
	if (balance > 0.0)
	this.balance = balance;
	}
	
	// methods
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}		
	public double getBalance()
	{
		return balance;
	}	

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}	

}
	

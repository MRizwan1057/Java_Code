import java.util.*;

public class Employeed implements Comparable<Employeed>
{
	private String name;
	private int ID;
	private double pay;
	
	public Employeed(String name, int ID, double pay)
	{
		this.name = name;
		this.ID = ID;
		this.pay = pay;
				
	}
	
	@Override
	public int compareTo(Employeed e)
	{
		if(this.ID == e.getId())
			return 0;
		if(this.ID < e.getId())
			return -1;
		else
			return 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return ID;
	}
	
	public double getPay()
	{
		return pay;
	}
	public String toString()
	{
		return String.format("\nEmployee : %s\t%d\t%.2f%n",getName(), getId(), getPay());
	}
	
	
}
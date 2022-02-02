public class Kharbuza extends Melon
{
	public Kharbuza(double weight, double antiOxidentAmount)
	{
		super(weight, antiOxidentAmount);	
	}
	
	public String toString()
	{
		return String.format("Kharbooz%n\tWeight %s",  super.toString());
	}
}
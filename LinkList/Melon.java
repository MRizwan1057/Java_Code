public abstract class Melon extends Fruit
{
	private double antiOxidentAmount;
	 
	public Melon(double weight, double antiOxidentAmount)
	{
		super(weight);
		this.antiOxidentAmount = antiOxidentAmount;
	}
	 
	public double getAntiOxidentAmount ()
	{
		 return antiOxidentAmount;
	}
	 
	@Override
	public String toString()
	{
		return String.format("Vitaman C %s", super.toString(), getAntiOxidentAmount());
		
	}
}
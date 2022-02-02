public class Malta extends Citrus
{
	public Malta(double weight, double vitCAmount)
	{
		super(weight, vitCAmount);	
	}
	
	public String toString()
	{
		return String.format("Malta%n\tWeight %s",   super.toString());
	}
}
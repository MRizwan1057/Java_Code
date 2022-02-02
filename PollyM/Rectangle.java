//  Rectangle.java

public class Rectangle extends Shape2d
{
	private double length;
	private double wirth;

	// constructor
	public Rectangle( double length, double wirth)
	{
		super(); 
		this.length = length;
		this.wirth = wirth;
	}

	public void setLength(double length)
	{
	 this.length = length;
	} 

	public double getLength()
	{
	 return length;
	}
	
	public void setWirth(double wirth)
	{
	 this.wirth = wirth;
	} 

	public double getWirth()
	{
	 return wirth;
	}
	
	@Override 
	public double getArea()
	{
	return length * wirth;
	}
	
	public double getPeremeter()
	{
	return 2 * (length + wirth);
	} 
	
	public String toString()
	{
		return String.format("Rectangle:%n\tArea: %.2f%n\tParameter: %.2f", getArea(), getPeremeter());

	}
}  // end class Rectangle
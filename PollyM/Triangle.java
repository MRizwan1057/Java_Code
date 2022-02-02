//  Triangle.java

public class Triangle extends Shape2d
{
	private double berith;
	private double height;
	private double length;
	
	// constructor
	public Triangle(double berith, double height, double length)
	{
	super();
	this.berith = berith;
	this.height = height;
	this.length = length;
	} 

	public void setBerith(double berith)
	{
		this.berith = berith;
	} 

	public double getBerith()
	{
	return berith;
	} 
	
	public void setHeight(double height)
	{
		this.height = height;
	} 

	public double getHeight()
	{
	return height;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	} 

	public double getLength()
	{
	return length;
	}
	
	@Override 
	public double getArea()
	{	
	return ((berith * height) / 2);
	}
	
	public double getPeremeter()
	{
	return (berith + height + length);
	}
	
	public String toString()
	{
		return String.format("Triangle:%n \tArea: %.2f%n\tParameter:%.2f%n%n", getArea(), getPeremeter());
	}
}   // end class Triangle
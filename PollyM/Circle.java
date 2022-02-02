//  Circle.java

public class Circle extends Shape2d
{
	private double radius; 
	private double  pai = 3.14; 

	// constructor
	public Circle(double radius)
	{
	super();
	this.radius = radius;
	} 

	public void setRadius(double radius)
	{
	this.radius = radius;
	} 

	public double getRadius()
	{
	return radius;
	} 
	
	@Override 
	public double getArea()
	{
	return  pai*(double)(Math.pow(radius, 2));
	}
	
	public double getPeremeter()
	{	
	return 2*((double)pai * radius);
	} 
	
	public String toString()
	{
		return String.format("Circle%n\tRadius %.2f%n\tArea %.2f%n\tParameter %.2f", radius, getArea(), getPeremeter());
	}
}   // end class Circle
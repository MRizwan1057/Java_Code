public class Ce
{
	private int radius;
	private double area;
	private double circum;
	private double pi= 3.14;
	private double average;

	//constructor
	public Ce(int radius)
	{
		this.radius = radius;	
	}
	
	// setter
	public void setRadius(int radius)
	{ 
		this.radius = radius;
	}
	
	// getters
	public int getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return area = pi*(radius*radius);
	}
	
	public double getCircum()
	{
		return circum = 2.0*(pi*radius);
	}
	
	public static double getAreaAverage(Ce[] setOfArea)
	{
		int total = 0;
		
		for(Ce tArea : setOfArea)
			total += tArea.getArea();
		
		return(double)total/setOfArea.length;
	}
	
	public static double getCircumAverage(Ce[] setOfCircum)
	{
		int total = 0;
		
		for(Ce tCircum : setOfCircum)
			total += tCircum.getCircum();
		
		return(double)total/setOfCircum.length;
	}
}
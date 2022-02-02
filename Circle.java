
public class Circle
{
	private float radius;
	
			public Circle (float radius)//, float area, float circum)
		{
			this.radius = radius;
		}
		
		// set method
	public void setradius(float radius)
	{
		
		this.radius = radius;
	}
	
	// method to get 
	public float getradius()
	{
		return radius;
	}

	public float getarea()
	{	
		
		return (double)  radius * 3.14;
	}
	
	public float getcircum()
	{
		
		return (double) radius * 2.0  * 3.14; 
	}
	
}
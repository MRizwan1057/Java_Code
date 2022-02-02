import java.util.*;
public class Rectangle //implements Comparable<Rectangle>
{
	private int width;
	private int length;
	
	public Rectangle(int width, int length)
	{
		this.width = width;
		this.length = length;
	}
	
	public int getArea()
	{
		return length*width;
	}
	public String toString()
	{
		return String.format("\nArea of Rectangle :%d%n", getArea());
	}
}
	
	
	
	
	class RecByArea implements Comparator<Rectangle>
	{
	@Override
	public int compare(Rectangle r1, Rectangle r2)
	{
		if(r1.getArea() == r2.getArea())
			return 0;
		if(r1.getArea() > r2.getArea())
	
			return 1;
			else
				return -1;
	
	}
		
	}
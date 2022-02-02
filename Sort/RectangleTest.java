import java.util.*;
import java.util.Collection;
public class RectangleTest
{
	public static void main(String[] args)
	{
		
		List<Rectangle> myList = new ArrayList<Rectangle>();
		
		Rectangle r1 = new Rectangle(6, 7);  
		Rectangle r2 = new Rectangle(12, 5);
		Rectangle r3 = new Rectangle(5, 4);  
		Rectangle r4 = new Rectangle(11, 6);
		
		 myList.add(r1);
		 myList.add(r2);
		 myList.add(r3);
		  myList.add(0,r4);

		
		 System.out.printf("There are currently %d elements in myList: %n%n", myList.size());
		
		 for(Rectangle rt: myList)
				System.out.println(rt);

		Collections.sort(myList, new RecByArea());
		System.out.printf("\n Here is sorted list by Area: %s\n", myList);

	
					
		Collections.sort(myList, Collections.reverseOrder(new RecByArea()));
		System.out.printf("\n Here is sorted list of Recatangle: %s\n", myList);
		
		
	}
}
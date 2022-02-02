import java.util.*;

public class EmployeedTest
{
	public static void main(String[] args)
	{
		List<Employeed> myList = new ArrayList<Employeed>();
		
		Employeed e1 = new Employeed("Usman", 1, 299.9);  
		Employeed e2 = new Employeed("Rizwan", 2, 399.9);
		Employeed e3 = new Employeed("Anwari", 3, 499.9);
		Employeed e4 = new Employeed("Danish", 4, 599.9);


		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
		myList.add(e4);

		
		System.out.printf("There are currently %d elements in myList: %n%n", myList.size());
		
		for(Employeed em: myList)
				System.out.println(em);
		//System.out.printf("\n%d\t %s\t: $ %.2f\n\n", em.getId(), em.getName(), em.getPay());
	
					
		Collections.sort(myList);
		System.out.printf("\n Here is sorted list by Employeed ID %s\n", myList);
		
		Collections.sort(myList, Collections.reverseOrder(new EmPayComparator()));
		System.out.printf("\n Here is pay based sorted list %s\n", myList);
		
		Collections.sort(myList, new EmNameComparator());
		System.out.printf("\n Here is name based sorted list %s\n", myList);
		
		
		
		
		
		// Employeed e1 = new Employeed("Usman", 1, 299.8);
		// Employeed e2 = new Employeed("Rizwan", 2, 399.8);
		// Employeed e3 = new Employeed("Adnan", 3, 499.8);		
		
		// System.out.printf("Employee one :%n %s :\t %s :\t%s%n%n", e1.getName(), e1.getId(), e1.getPay());
		// System.out.printf("Employee two :%n %s :\t %s :\t%s%n%n", e2.getName(), e2.getId(), e2.getPay());
		// System.out.printf("Employee three :%n %s :\t %s :\t%s%n%n", e3.getName(), e3.getId(), e3.getPay());
	}
	
}
// Assignment # 1
// EmployeeTest.java
public class EmployeeTest
{
	public static void main(String[] args)
	{
		// now we create  2 objects for class Employee
		
	Employee emp1 = new Employee("Muhammad", "Rizwan", (double)50000.0);
	
	Employee emp2 = new Employee("Muhammad", "Usman", (double)60000.0);
	
		// now we print result below

	
			System.out.printf("emp1 firstname is: %s %n", emp1.getfirstname());
			System.out.printf("emp1 lastname is: %s %n", emp1.getlastname());
			System.out.printf("emp1 yearlysalary is: %s  %n", emp1.getmnthsalary() * (double) 12.0);
			
			System.out.println("	*****");// just  for better readability
			
			System.out.printf("emp1 firstname is: %s %n", emp2.getfirstname());
			System.out.printf("emp1 lastname is: %s %n", emp2.getlastname());
			System.out.printf("emp1 yearlysalary is: %s  %n", emp2.getmnthsalary() *(double)12.0);
			
			System.out.println("	*****");// just for better readability
			System.out.println("After 10% yearly salary is: ");
			
			emp1.mnthsalary = emp1.mnthsalary * (double)12.0 *  (double) 10.0 / 100 + emp1.mnthsalary* (double) 12.0;
			emp2.mnthsalary = emp2.mnthsalary * (double)12.0 *  (double) 10.0 / 100 + emp2.mnthsalary * (double) 12.0;
			
			System.out.printf("emp1 new salary is: %s %n",emp1.mnthsalary );
			System.out.printf("emp2 new salary is: %s %n",emp2.mnthsalary );
			
			System.out.println("	*****");// just for better readability
			System.out.println("Congratulation ! finally we got our desired result !!!");
			System.out.println("	***/ Program Ended /***");// just print blank line for better readability
			
	} // method main ended...
	
} // class EmployeeTest ended...


public class Student1Test
{
	public static void main(String[] args)
	{
		Student1 student1 =  new Student1("Muhammad Anas", 93.5);
		Student1 student2 =  new Student1("Imran Nazir", 72.75);
		
		System.out.printf("%s's letter grade is: %s%n", 
			student1.getName(), student1.getLetterGrade()); 
		System.out.printf("%s's letter grade is: %s%n", 
			student2.getName(), student2.getLetterGrade()); 
	}
}
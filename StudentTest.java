// Fig. 4.5: StudentTest.java
 // Create and test Student objects.
 public class StudentTest
 {
 public static void main(String[] args)
 {
 Student account1 = new Student("Shaid Afridi", 93.5);
 Student account2 = new Student("Imran Nazir", 72.75); 

 System.out.printf("%s's letter grade is: %s%n", 
 account1.getName(),account1.getLetterGrade() ); 
 System.out.printf("%s's letter grade is: %s%n", 
 account2.getName(),account2.getLetterGrade() ); 
 } 
 } // end class StudentTest
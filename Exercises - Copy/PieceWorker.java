public class PieceWorker extends Employee
{

 private double wage;
 private double pieces;


 // five-argument constructor
 public PieceWorker( String first, String last, String ssn,
 double wagePerPiece, double piecesProduced )
 {
 super( first, last, ssn); // Sends to superclass constructor
 setWage( wagePerPiece); // Sets wage per piece
 setPieces( piecesProduced);
 } // end five-argument PieceWorker constructor

 public void setWage(double wagedWork)
 {
 wage = wagedWork;
 }// Sets the workers wage

 public double getWage()
 {
 return wage;
 } // return wage

 // set pieces produced
 public void setPieces( double piecesMade)
 {
 pieces = piecesMade;
 }// Set the amount of pieces produced

 public double getPieces()
 {
 return pieces;
 }// Return pieces made

 // calculate earnings; override abstract method earnings in Employee
 public double earnings()
 {
 return getWage() * getPieces();

 } // end method earnings
 // return String representation of PieceWorker object
 public String toString()
 {
 return String.format( "%s: %s\n%s: $%,.2f\n%s: %.2f",
 "Piecework Employee", super.toString(),"Wage is", getWage(),
 "Number of pieces", getPieces(), earnings() );
 //Conversion character f will print at least one number to the right of the
//decimal
 //Make sure the formating is the exact way you want it
 //The spaces in the formatting will effect the way it prints out

 } // end method toString
} // end class PieceWorker

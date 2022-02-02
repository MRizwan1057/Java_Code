public class ShapeTest{
	
	public static void main(String[] args){
		
		double totalArea = 0;
		double totalPeremeter = 0; 
		Circle c1 = new Circle(5);
		Triangle t1 = new Triangle(5, 4, 6);
		Rectangle r1 = new Rectangle(3, 5);
		
		
		Shape2d[] shapes = new Shape2d[3];	
		shapes[0] = c1; 
		shapes[1] = t1; 
		shapes[2] = r1;
		
		System.out.printf("2D Shapes Areas are follwing:%n%n");
		
			
		 for (Shape2d currentShape : shapes){
			System.out.println(currentShape);
			totalArea += currentShape.getArea();
			totalPeremeter += currentShape.getPeremeter();
				
		}
		System.out.printf("%n%nTotal Area: \t\t%.2f%n%n",  totalArea);
		System.out.printf("Total Parameter: \t%.2f%n%n", totalPeremeter);
		
		totalArea = totalPeremeter = 0;
		for (Shape2d currentShape : shapes){
		
			if(currentShape instanceof Circle){
				Circle circle = (Circle) currentShape;
				circle.setRadius(.5 * circle.getRadius() + circle.getRadius());	
			}			
			
			System.out.println(currentShape);
			totalArea += currentShape.getArea();
			totalPeremeter += currentShape.getPeremeter();
		}
		System.out.println("After increasing 50 % : ");
		
		System.out.printf("%nTotal Area: \t\t%.2f%n%n",  totalArea);
		System.out.printf("Total Parameter: \t%.2f%n%n", totalPeremeter);
		
	}   
}  
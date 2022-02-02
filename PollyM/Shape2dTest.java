public class Shape2dTest{
	
	public static void main(String[] args){
		
		double totalArea = 0;
		double totalPeremeter = 0; 
		
		Shape2d[] shapes = new Shape2d[3];	
		shapes[0] = new Circle(5); 
		shapes[1] = new Triangle(5,4,6); 
		shapes[2] = new Rectangle(3,5);
		
		System.out.printf("2D Shapes Areas are follwing:%n%n");
		
		 for (Shape2d currentShape : shapes){
			System.out.println(currentShape);
			totalArea += currentShape.getArea();
			totalPeremeter += currentShape.getParameter();
				
		}
		
		System.out.println("Total Area: " + totalArea);
		System.out.println("Total Parameter: " + totalPeremeter);
		
		totalArea = totalPeremeter = 0;
		for (Shape2d currentShape : shapes){
		
			if(currentShape instanceof Circle){
				Circle circle = (Circle) currentShape;
				circle.setRadius(.5 * circle.getRadius() + circle.getRadius());	
			}			
			
			System.out.println(currentShape);
			totalArea += currentShape.getArea();
			totalPeremeter += currentShape.getParameter();
		}
		System.out.println("Total Area: " + totalArea);
		System.out.println("Total Parameter: " + totalPeremeter);
		
	}   
			
		 // for (Shape2d currentShape : shapes){
			// System.out.println(currentShape);
			// totalArea += currentShape.getArea();
			// totalPeremeter += currentShape.getPeremeter();
				
		// }
		
		// System.out.printf("Total Area: %.2f%n%n", totalArea);
		// System.out.printf("Total Parameter: %.2f%n%n", totalPeremeter);
		
		//totalArea = totalPeremeter = 0;
		// for (Shape2d currentShape : shapes){
		
			// if(currentShape instanceof Circle){
				// Circle circle = (Circle) currentShape;
				// circle.setRadius(.5 * circle.getRadius() + circle.getRadius());	
			// }			
			
			// System.out.println(currentShape);
			
			//totalArea += currentShape.getArea();
			//totalPeremeter += currentShape.getPeremeter();
		// }
		// System.out.println("Total Area: " + totalArea);
		// System.out.println("Total Parameter: " + totalPeremeter);
		//
	// }   
}  
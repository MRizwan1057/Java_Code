public class Kinu extends Citrus{
	
	
	public Kinu(double weight, double vitCAmount){
		super(weight, vitCAmount);
		
	}
	

	public String toString(){
		return String.format("Kinu%n\tWeight %s",   super.toString());
		
	// return String.format("Circle%n\tArea %.2f%n\tParameter %.2f",  getweight(), getVitCAmount());

	}
}
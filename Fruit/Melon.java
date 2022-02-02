public abstract class Melon extends Fruit {
	
	private double antiOxidentAmount;
	
	public Melon(double weight, double antiOxidentAmount){
		super (weight);
		this.antiOxidentAmount = antiOxidentAmount;
	}
	
	public double getAntiOAmount(){
		return antiOxidentAmount;
	}
	
	@Override
	public String toString(){
		return String.format("Antioxide %s%.2f", super.toString(), getAntiOAmount());
	}
}
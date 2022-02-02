public class FruitTest
{
	
	
	public static void main(String[] args)
	{
		
		double totalWeight = 0;
		double totalVCAmount = 0;
		double totalAntiOxidentAmount = 0; 
		
		Fruit[] Fruits = new Fruit[4];	
		Fruits[0] = new Kinu(13,35);
		Fruits[1] = new Malta(23,54); 
		Fruits[2] = new Kharbuza(23,45);
		Fruits[3] = new Tarbooz(13,27);
	
		
		System.out.printf("Fruits are follwing:%n%n");
		
			
		for (Fruit currentFruit : Fruits)
		{
			totalWeight += currentFruit.getWeight();
			
			if(currentFruit instanceof Citrus)
			{
				Citrus vit = (Citrus)currentFruit;
				totalVCAmount += vit.getVitCAmount();
			}
		
			if(currentFruit instanceof Melon)
			{
				Melon meln = (Melon)currentFruit;
				totalAntiOxidentAmount += meln.getAntiOxidentAmount();
			}
			
		}
		
		System.out.println("Total Weight: " + totalWeight);
		System.out.println("Total Vitamins: " + totalVCAmount);
		System.out.println("Total Antioxide: " + totalAntiOxidentAmount);
		
	}   
}
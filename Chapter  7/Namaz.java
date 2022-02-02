

public class Namaz{
	
	private String SalaahName;
	private int [][] salaah;
	
	public Namaz(String SalaahName, int[][] salaah){
		this.SalaahName = SalaahName;
		this.salaah = salaah;
	}
	
	public void setSalaahName(String SalaahName){
		this.SalaahName = SalaahName;
	}
	
	public String getSalaahName(){
		return SalaahName;
	}
	
    public void processSalaah(){
		outputGrades();
		
	}
	
	public double getAverage(int[] SalaahArray){
		
		int total = 0; 	
		for(int count : SalaahArray)
			total += count;
		return (double)total / SalaahArray.length;
		
	}
	
	
	public void outputGrades(){
		
		System.out.printf("The average of Sallah are : %n%n");
		System.out.print("            ");
		
		//for(int Salaah = 0; Salaah < grades[0].length; Salaah++)
			
			System.out.printf("%s\t%s\t%s\t%s\t%s\t","Fajar","Zohar","Asar","Maghrib","Isha");
		System.out.println("    Average"); 
		System.out.println(); 
		
		for(int Numazi = 0; Numazi < salaah.length; Numazi++){
			
			System.out.printf("Namazi %2d:", Numazi + 1);
			 
			for(int i : salaah[Numazi])
				System.out.printf("%10d", i);
			
			double average = getAverage(salaah[Numazi]);
			
			System.out.printf("%9.2f%n", average);
		}	
	}	
}
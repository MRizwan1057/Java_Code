
public class NamazTest{
	
	public static void main(String[] args){
		
		int SalaahArray[] [] = {{2,4,4,3,4},{2,4,4,3,0},{0,4,4,0,4},{2,0,4,3,0},
		{0,4,4,3,4}};
		
		Namaz mySalaah = new Namaz(
		"Five time Salaah in a day", SalaahArray);
		System.out.printf("Welcome to the Salaah arrayr%n%s%n%n",
		mySalaah.getSalaahName());
		mySalaah.processSalaah();
	}
}
/*


public class SalaahTest{
	
	public static void main(String[] aggs){
		
		int array[] [] = {{2,4,4,3,4},{2,4,4,3,0},{0,4,4,0,4},{0,4,4,3,0},
		{2,4,0,3,4}};
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++)
		
		
		averageArray(array);
		//getAverage(array);
		System.out.println(array[i][j]);
		if(i % 5 == 0)
			System.out.println();
		
		}
		
		averageArray{
			
		}
	}
}	
*/
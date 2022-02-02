public class InitArray{
	public static void main(String[] args){
		//check number of command line argument
		if(args.length !=4)
		System.out.printf("Error:Please re-enter the entire command,including%n"+"an array size,initial value and increment.%n");
		else
		{
			int arrayLength=Integer.parseInt(args[0]);
			int[] array=new int[arrayLength];
			//get intial value and increment from cmmand-line argument
			int initialValue=Integer.parseInt(args[1]);
			int increment=Integer.parseInt(args[2]);
			//int square=Integer.parseInt(args[3]);
			//calculate value each array element
			for(int counter=0; counter<array.length; counter++)
				array[counter]=initialValue+increment*counter;
			System.out.printf("%s%8s%n","index","Value");
			//disply array index
			for(int counter=0; counter<array.length; counter++)
				System.out.printf("%5d%8d%n",counter, array[counter]);
		}
	}
}
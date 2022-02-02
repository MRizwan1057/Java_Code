public class fruitStack{
	
	public static void main(String[] args){
		
		String[] StringElements = {"Malta", "Kinu", "Kharbuza", "Tarbooz"};
		// int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Stack<String> StringStack = new Stack<>(); 
		// Stack<Integer> integerStack = new Stack<>(); 
		
		testPushString(StringStack, StringElements); 
		testPopString(StringStack);
		
		// testPushInteger(integerStack, integerElements); 
		testPopString(StringStack); 
	}
	
	private static void testPushString(
		Stack<String> stack, String[] values){
	
		System.out.printf("%nPushing elements onto StringStack%n");
		
		for (String value : values){
			System.out.printf("%s ", value);
			stack.push(value);
		}
	}	
	private static void testPopString(Stack<String> stack){
	
		try{
			System.out.printf("%nPopping elements from StringStack%n");
			String popValue;
			
			while (true){
				popValue = stack.pop(); 
				System.out.printf("%s ", popValue);
			}
		}
		
		catch(EmptyStackException emptyStackException){
			
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}
	
	// private static void testPushInteger(
	// Stack<Integer> stack, int[] values){
		
		// System.out.printf("%nPushing elements onto integerStack%n");
		
		// for (int value : values){
			// System.out.printf("%s ", value);
			// stack.push(value); 
		// }
	// }
	// private static void testPopInteger(Stack<Integer> stack){
		
		// try{
			// System.out.printf("%nPopping elements from integerStack%n");
			// int popValue;
			
			// while (true){
				// popValue = stack.pop(); 
				// System.out.printf("%s ", popValue);
			// }
		// }
		// catch(EmptyStackException emptyStackException){
			
			// System.err.println();
			// emptyStackException.printStackTrace();
		// }
	// }
}
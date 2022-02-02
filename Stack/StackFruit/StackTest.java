// Fig. 20.9: StackTest.java
// Stack generic class test program.

public class StackTest 
{
	public static void main(String[] args) 
	{
		Fruit[] Fruits = new Fruit[4];	
		Fruits[0] = new Kinu(3,5);
		Fruits[1] = new Malta(3,4); 
		Fruits[2] = new Kharbuza(2,7);
		Fruits[3] = new Tarbooz(13,2);
		Stack<Fruit> FruitStack = new Stack<>();
		
		// push elements of doubleElements onto doubleStack
		testPushFruit(FruitStack, Fruits); 
		testPopFruit(FruitStack); // pop from doubleStack
	} 
		
	// test push method with double stack
	private static void testPushFruit(
	Stack<Fruit> stack, Fruit[] values)
	{
		System.out.printf("%nPushing elements onto doubleStack%n");
		
		// push elements to Stack
		for (Fruit value : values)
		{
			System.out.println(value);
			stack.push(value); // push onto doubleStack
		}
	}
	
	// test pop method with double stack
	private static void testPopFruit(Stack<Fruit> stack)
	{
		// pop elements from stack
		try
		{
			System.out.printf("%nPopping elements from doubleStack%n");
			Fruit popValue; // store element removed from stack
			
			// remove all elements from Stack
			while (true)
			{
				popValue =   stack.pop(); // pop from doubleStack
				System.out.println(popValue); 
			} 
		}
		catch(EmptyStackException emptyStackException)
		{
			System.err.println();
			emptyStackException.printStackTrace();
		} 
	}
} // end class StackTest
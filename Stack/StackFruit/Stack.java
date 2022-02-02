import java.util.*;

public class Stack<Fruit> 
{
	private final ArrayList<Fruit> elements; // ArrayList stores stack elements
	
	public Stack()
	{
		this(10); // default stack size
	}
	 
	// constructor creates a stack of the specified number of elements
	public Stack(int capacity)
	{
		int initCapacity = capacity > 0 ? capacity : 10; // validate
		elements = new ArrayList<Fruit>(initCapacity); // create ArrayList
	}
	
	// push element onto stack
	public void push(Fruit pushValue)
	{
		elements.add(pushValue); // place pushValue on Stack
	}
	
	// return the top element if not empty; else throw EmptyStackException
	public Fruit pop()
	{
		if (elements.isEmpty()) // if stack is empty
		throw new EmptyStackException("Stack is empty, cannot pop");

		// remove and return top element of Stack
		return elements.remove(elements.size() - 1);
	}
}  // end class Stack<T>
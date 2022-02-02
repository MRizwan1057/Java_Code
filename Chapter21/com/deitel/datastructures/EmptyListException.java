//Fig. 21.4
package com.deitel.datastructures;

public class EmptyListException extends RuntimeException
{
	public EmptyListException()
	{
		this("List");
	}
	
	public EmptyListException(String name)
	{
		super(name + "is empty");
	}
}
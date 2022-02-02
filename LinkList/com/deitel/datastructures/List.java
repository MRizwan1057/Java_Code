//Fig.21.3
//package com.deitel.datastructures;
package com.deitel.datastructures;
class ListNode<Fruit>
{
	Fruit data;
	ListNode<Fruit> nextNode;
	
	ListNode(Fruit object)
	{
		this(object, null);
	}
	
	ListNode(Fruit object, ListNode<Fruit> node)
	{
		data = object;
		nextNode = node;
	}
	
	Fruit getData()
	{
		return data;
	}
	
	ListNode<Fruit> getNext()
	{
		return nextNode;
	}
} //end class ListNode<T>

// class List definition
public class List<Fruit>
{
	private ListNode<Fruit> firstNode;
	private ListNode<Fruit> lastNode;
	private String name;
	
	public List()
	{
		this("list");
	}
	
	public List(String listName)
	{
		name = listName;
		firstNode = lastNode = null;
	}
	
	public void insertAtFront(Fruit insertItem)
	{
		if(isEmpty())
			firstNode = lastNode = new ListNode<Fruit>(insertItem);
		else
			firstNode = new ListNode<Fruit>(insertItem, firstNode);
	}
	
	public void insertAtBack(Fruit insertItem)
	{
		if(isEmpty())
			firstNode = lastNode = new ListNode<Fruit>(insertItem);
		else
			firstNode = new ListNode<Fruit>(insertItem);
	}
	
	public Fruit removeFromFront() 
	{
		if(isEmpty())
			throw new EmptyListException(name);
		
		Fruit removedItem = firstNode.data;
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
		
		return removedItem;
	}
	
	
	public Fruit removeFromBack() throws EmptyListException
	{
		if(isEmpty())
			throw new EmptyListException(name);
		
		Fruit removedItem = lastNode.data;
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
		{
			ListNode<Fruit> current = firstNode;
			
			while(current.nextNode != lastNode)
				current = current.nextNode;
			
			lastNode = current;
			current.nextNode = null;
		}
		return removedItem;
	}
	
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	
	public void print()
	{
		if(isEmpty())
		{
			System.out.printf("Empty %s%n", name);
			return;
		}
		
		System.out.printf("The %s is: ",name);
		ListNode<Fruit> current = firstNode;
		
		while(current != null)
		{
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}
		System.out.println();
	}
}


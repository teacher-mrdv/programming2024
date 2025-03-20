/*
 * Linked list
 */

public class LinkedList
{
	Node start;
	
	public boolean isEmpty()
	{
		if(start == null)
		{	return true;
		} else
		{	return false;
		}
		//return start == null;
	}

	public void append(Node newNode)
	{
		if( isEmpty() )
		{	start = newNode;
			return;
		}
		Node temp = start;
		while(temp.next != null)
		{	temp = temp.next;
		}
		temp.next = newNode;
	}

	public boolean remove(int delete)
	{	if( isEmpty() )
		{	return false;
		}
		if( delete == start.data )
		{	start = start.next;
			return true;
		}
		Node previous= start;
		Node current = start.next;
		// this part of the method needs improvements!
		while( current.data != delete)
		{	previous = previous.next;
			current  = current.next;
		}
		if( current.data == delete)
		{	previous.next = current.next;
			return true;
		}
		return false;
	}

	// more typical IB question than adding a counter to the class
	public int size()
	{
		Node temp = start;
		int size = 0;
		while( temp != null )
		{	size++;
			temp = temp.next;
		}
		return size;
	}

	public void printLL()	// NOT a built-in
	{
		Node temp = start;
		System.out.print("Start -> ");
		while( temp != null )
		{	System.out.print( temp.data + " -> " );
			temp = temp.next;
		}
		System.out.println("null");
	}

}


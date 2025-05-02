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
		// checking for null is important!
		while( current.next != null && current.data != delete )
		{	previous = previous.next;
			current  = current.next;
		}
		if( current.data == delete)
		{	previous.next = current.next;
			return true;
		}
		return false;
	}

	public int removeAt(int place)
	{
		if (isEmpty())
        {	System.out.println("Error-linked list is empty");
            return 0;
        }
        Node temp = start;
        int counter = 0;
        int delData = 0;
        if( place < 1 || place > size() )
        {	System.out.println("Error-place out of bounds");
            return 0;
		}
        // redundant! why?
        if( place == 1 )
        {	delData = start.data;
            start = start.next;
            return delData;
        }
        while(temp.next != null) //counter < size() - 1)
        {	if(counter == place - 1)
            {	delData = temp.next.data;
                temp.next = temp.next.next;
                break; //return delData;
            }
            temp = temp.next;
            counter++;
        }
        return delData;
	}

	// insert BEFORE place
	public void insertBefore(Node insert, int place)
	{	if(place < 1 || place > size())
		{	System.out.println("ERROR - Insertion place out of bounds!");
			return;
		}
		if(place == 1)
		{	insert.next = start;
			start = insert;
			return;
		}
		int counter = 1;
		Node temp = start;
		while(counter < place-1)
		{	temp = temp.next;
			counter++;
		}
		insert.next = temp.next;
		temp.next = insert;
	}

	// insert AFTER a place
	public void insertAfter(Node insert, int place)
	{	if(place < 1)
		{	System.out.println("ERROR - Insertion place out of bounds!");
			return;
		}
		if(place == 1)
		{	insert.next = start;
			start = insert;
			return;
		}
		int counter = 1;
		Node temp = start;
		while(counter < place)
		{	temp = temp.next;
			counter++;
		}
		insert.next = temp.next;
		temp.next = insert;
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


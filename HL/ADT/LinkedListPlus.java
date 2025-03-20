/*
 * Linked list
 */

public class LinkedListPlus
{
	// https://gist.github.com/fnky/458719343aabd01cfb17a3a4f7296797
	private static final String bold  = "\u001b[1m";
	private static final String blink = "\u001b[5m";
	private static final String invrs = "\u001b[7m";
	private static final String reset = "\u001b[0m";
	
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

	public boolean remove(Node delete)
	{	if( isEmpty() )
		{	// System.out.println("Linked list is \[1mempty\[22m!");
			return false;
		}
		if( delete.data == start.data )
		{	start = start.next;
			return true;
		}
		Node previous= start;
		Node current = start.next;
		//             vvv see methods in the vvv Node class
		while( current.hasNext() && current.equals(delete))
		// same as while( current.next != null && current.data != delete.data)
		{	previous = previous.next;
			current  = current.next;
		}
		if( current.data == delete.data)
		{	previous.next = current.next;
			return true;
		}
		return false;
		/* OR...
		if( current.data == delete.data)
		{	previous.next = current.next;
			return true;
		} else
		{	return false;
		}
		*/
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

	public static void main(String[] args)
	{
		LinkedListPlus ll = new LinkedListPlus();
		System.out.println("Linked list is " +
			invrs + bold + blink + " empty " + reset + "!");
		System.out.println("\n>>> Appending 5, 3, 9, 7, 1, 6, 4 to the linked list (ll):");
		Node n = new Node(5);
		ll.append(n);	ll.printLL();
		n = new Node(3);
		ll.append(n);	ll.printLL();
		n = new Node(7);
		ll.append(n);	ll.printLL();
		n = new Node(9);
		ll.append(n);	ll.printLL();
		n = new Node(1);
		ll.append(n);	ll.printLL();
		n = new Node(6);
		ll.append(n);	ll.printLL();
		n = new Node(4);
		ll.append(n);	ll.printLL();
		System.out.println("\nRemoving 5: " + ll.remove(new Node(5)));
		ll.printLL();
		System.out.println("\nRemoving 4: " + ll.remove(new Node(4)));
		ll.printLL();
		System.out.println("\nRemoving 9: " + ll.remove(new Node(9)));
		ll.printLL();
		System.out.println("\nRemoving 11: " + ll.remove(new Node(11)));
		ll.printLL();
	}

}


/*
 * Linked list driver/test class
 * 
 */


public class LinkedListTest
{
	
public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
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
	}
}


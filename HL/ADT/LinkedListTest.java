/*
 * Linked list driver/test class
 * 
 */


public class LinkedListTest
{
	
public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
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
		System.out.println("\nRemoving 5:");
		ll.remove(5);	ll.printLL();
		System.out.println("\nRemoving 4:");
		ll.remove(4);	ll.printLL();
		System.out.println("\nRemoving 9:");
		ll.remove(9);	ll.printLL();
	}
}


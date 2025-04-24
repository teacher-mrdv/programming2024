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
		System.out.println("\nRemoving 5: " + ll.remove(5));
		ll.printLL();
		System.out.println("\nRemoving 4: " + ll.remove(4));
		ll.printLL();
		System.out.println("\nRemoving 9: " + ll.remove(9));
		ll.printLL();
		System.out.println("\nRemoving 11: " + ll.remove(11));
		ll.printLL();
		n = new Node(2);
		System.out.println("\nInserting 2 before 1st node: ");
		ll.insertBefore(n, 1);
		ll.printLL();
		n = new Node(9);
		System.out.println("\nInserting 9 before 5th node: ");
		ll.insertBefore(n, 5);
		ll.printLL();
		n = new Node(5);
		System.out.println("\nInserting 5 before 3rd node: ");
		ll.insertBefore(n, 3);
		ll.printLL();
		// homework test cases/checks below
		n = new Node(4);
		System.out.println("\nInserting 4 after the first node: ");
		ll.insertAfter(n, 1);
		ll.printLL();
		n = new Node(8);
		System.out.println("\nInserting 8 after the 4th node: ");
		ll.insertAfter(n, 4);
		ll.printLL();
		n = new Node(12);
		System.out.println("\nInserting 12 after the last node: ");
		ll.insertAfter( n, ll.size() );
		ll.printLL();
		
	}
}


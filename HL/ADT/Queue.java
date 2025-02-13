
public class Queue
{
	Node head;
	Node tail;
	int size = 0;

	public boolean isEmpty()
	{
		return head == null;
	}

	public void enqueue(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		if( isEmpty() )
		{
			head = newNode;
			tail = newNode;
			//return;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void printQueue()
	{
		Node temp = head;
		System.out.print("Head");
		if( isEmpty() )
		{
			System.out.print( " -> null" );
		}
		while( temp != null )
		{	System.out.print( " -> " + temp.data );
			temp = temp.next;
		}
		System.out.println(" <- tail    Size = " + size);
	}
}


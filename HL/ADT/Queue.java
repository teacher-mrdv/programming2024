
public class Queue
{
	Node head;
	Node tail;
	int size = 0;	// NOT a built-in; some exams refer to size/size()

	public boolean isEmpty()	// built-in; assume it already exists
	{
		return head == null;
	}

	public void enqueue(int data)// built-in; assume it already exists
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

	public int dequeue()	// built-in; assume it already exists
	{
		if( !isEmpty() )
		{
			int data = head.data;
			head = head.next;
			size--;
			return data;
		} else {
			System.out.println("Error - Queue is empty");
			return 0;
		}
	}

	public void printQueue()	// NOT a built-in
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


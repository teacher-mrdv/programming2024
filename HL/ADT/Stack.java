public class Stack
{
	Node top;
	int size = 0;

	public boolean isEmpty()
	{
		if(top == null)
		{	return true;
		} else {
			return false;
		}
		//return top == null;
	}

	public void push(int d)
	{
		Node newNode = new Node();	// creating the new node to
		newNode.data = d;			// add to the stack
		if( isEmpty() )
		{	top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	public int pop()
	{
		if( !isEmpty() )
		{
			int topData = top.data;
			top = top.next;
			size--;
			return topData;
		} else {
			System.out.println("Error-stack is empty!");
			return 0;
		}
	}

	public int peek()
	{
		return top.data;
	}

	public void printStack()
	{
		Node temp = top;
		System.out.print("Top -> ");
		while( temp != null )
		{	System.out.print( temp.data + " -> " );
			temp = temp.next;
		}
		System.out.println("null    Size = " + size);
	}

	/* less efficient than using a variable to keep track of the size
	public int size()
	{
		Node temp = top;
		int counter = 0;
		while( temp != null )
		{	counter++;
			temp = temp.next;
		}
		return counter;
	} */

}



public class Stack
{
	Node top;
	
	public boolean isEmpty()
	{	/*
		if(top == null)
			return true;
		else
			return false;
		*/
		return top == null;
	}
	
	public void push(int d)
	{	//Node newNode = new Node(d);
		Node newNode = new Node();	// declare and instantiate (create) the new node
		newNode.data = d;			// initialise the data of the node to d
		if( isEmpty() )
		{
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	
	public void printStack()
	{
		Node temp = top;
		System.out.print("TOP -> ");
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}
}


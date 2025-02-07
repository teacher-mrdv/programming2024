
public class StackTest
{
	
	public static void main (String[] args)
	{
		Stack s = new Stack();
		s.printStack();
		s.push(5);
		s.printStack();
		s.push(3);
		s.printStack();
		s.push(9);
		s.printStack();
		s.push(7);
		s.printStack();
		
		System.out.println("Popping : " + s.pop());
		s.printStack();
		System.out.println("Popping : " + s.pop());
		s.printStack();
		System.out.println("Popping : " + s.pop());
		s.printStack();
		System.out.println("Popping : " + s.pop());
		s.printStack();
		System.out.println("Popping : " + s.pop());
		s.printStack();
	}
}


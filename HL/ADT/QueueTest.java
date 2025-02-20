import java.util.Arrays;

public class QueueTest
{
	
	public static void main (String[] args)
	{
		Queue myQueue = new Queue();
		myQueue.printQueue();
		myQueue.enqueue(5);	myQueue.printQueue();
		myQueue.enqueue(6);	myQueue.printQueue();
		myQueue.enqueue(7);	myQueue.printQueue();
		myQueue.enqueue(9);	myQueue.printQueue();
		/*
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
		*/
		int[] array = new int[myQueue.size];
		int index = 0;
		while(!myQueue.isEmpty())
		{	array[index] = myQueue.dequeue();
			myQueue.printQueue();
			System.out.println(Arrays.toString(array));
			index++;
		}
			
	}
}


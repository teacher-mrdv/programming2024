/*
 * QueueTest assuming that we are using the IBO's ADT implementation
 * which DOES NOT HAVE a size variable to keep track of an ADT's size
 */
import java.util.Arrays;

public class QueueTestIB
{
	
	public static void main (String[] args)
	{
		System.out.println("\nEnqueuing 5,6,7,9,3:");
		Queue myQueue = new Queue();
		myQueue.printQueue(); // <-- to visualise how the queue changes
		myQueue.enqueue(5);	myQueue.printQueue();
		myQueue.enqueue(6);	myQueue.printQueue();
		myQueue.enqueue(7);	myQueue.printQueue();
		myQueue.enqueue(9);	myQueue.printQueue();
		myQueue.enqueue(3);	myQueue.printQueue();

		System.out.println("\nTransferring the queue to an array");
		System.out.print("Original Q: ");
		myQueue.printQueue();
		/* this is how we would have to calculate the size of the queue,
		 * stack or linked list if we didn't have a size variable
		 * keeping track of it in the Stack and Queue classes,
		 * which is the way the IB implement their ADTs */
		Node temp = myQueue.head;
		int qSize = 0;
		while( temp != null )
		{	qSize++;
			temp = temp.next;
		}
		// since now we know the queue size, we can create the array
		int[] array = new int[qSize]; 
		// FOR loop implementation to move all queue elements to an array
		for(int i = 0; i < qSize; i++)
		{	array[i] = myQueue.dequeue();
			myQueue.printQueue();
			System.out.println("Array = " + Arrays.toString(array));
		}
		// WHILE loop implementation to move all queue elements to an array
		/*
		int index = 0;
		while(!myQueue.isEmpty())
		{	array[index] = myQueue.dequeue();
			myQueue.printQueue(); // optional, shows how the queue changes
			System.out.println("Array = " + Arrays.toString(array)); // optional, shows how the array changes (using an external library/imported class which we're not allowed to use in exams
			index++;
		}
		*/
		
		// challenge: COPY the queue to the array (without dequeuing it)
		


		
	}
}


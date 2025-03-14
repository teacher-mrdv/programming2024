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

		System.out.println("\nCOPYING the queue to an array");
		System.out.print("Original Q: ");
		myQueue.printQueue();
		/* this is how we would have to calculate the size of the queue,
		 * stack or linked list if we didn't have a size variable
		 * keeping track of it in the Stack and Queue classes,
		 * which is the way the IB implement their ADTs */
		int myQueueSize = 0;
		Node temp = myQueue.head;
		while(temp != null)
		{	temp = temp.next;
			myQueueSize++;
		}
		// declare and create the array with the same length as the queue size
		int[] array = new int[myQueueSize];
		// since now we know the queue size, we can create the array
		// challenge: COPY the queue to the array (without dequeuing it)
		temp = myQueue.head;
		for(int i = 0; i < myQueueSize; i++)
		{	array[i] = temp.data;
			temp = temp.next;
			System.out.println("Array = " + Arrays.toString(array));
		}
		System.out.print("Final queue: "); myQueue.printQueue();
		
		// moving all queue elements to an array (WHILE loop version)
		int[] move = new int[myQueueSize];
		System.out.println("\nTransferring the queue to an array");
		int index = 0;
		while(!myQueue.isEmpty())
		{	myQueue.printQueue(); // optional, shows how the queue changes
			move[index] = myQueue.dequeue();
			System.out.println("Array = " + Arrays.toString(move)); // optional, shows how the array changes (using an external library/imported class which we're not allowed to use in exams
			index++;
		}
		System.out.print("Final queue: "); myQueue.printQueue();
		
		// FOR loop implementation of the above
		/*
		for(int i = 0; i < myQueueSize; i++)
		{	array[i] = myQueue.dequeue();
			myQueue.printQueue();
			System.out.println("Array = " + Arrays.toString(array));
		}
		*/
		
	}
}


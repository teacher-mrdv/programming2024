/*
 * QueueTest assuming that we are using our ADT implementation
 * which has a size variable that keeps track of an ADT's / queue's size
 */
 import java.util.Arrays;

public class QueueTest
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
		
		int[] array = new int[myQueue.size];
		
		/* // moving all queue elements to an array (WHILE loop version)
		int index = 0;
		while(!myQueue.isEmpty())
		{	array[index] = myQueue.dequeue();
			myQueue.printQueue(); // optional, shows how the queue changes
			System.out.println("Array = " + Arrays.toString(array)); // optional, shows how the array changes (using an external library/imported class which we're not allowed to use in exams
			index++;
		}
		*/
		// FOR loop implementation of the above
		
		int qSize = myQueue.size;	// because the Q size will change as we dequeue it
		for(int i = 0; i < qSize; i++)
		{	array[i] = myQueue.dequeue();
			myQueue.printQueue();
			System.out.println("Array = " + Arrays.toString(array));
		}

		// challenge: COPY the queue to the array (without dequeuing it)
		
	}
}


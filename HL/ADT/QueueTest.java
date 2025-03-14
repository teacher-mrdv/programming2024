/*
 * QueueTest assuming that we are using our ADT implementation
 * which has a size variable that keeps track of an ADT's / queue's size
 * Please also check QueueTestIB for IB style coding of the same problem
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

		System.out.println("\nCopying the queue to an array");
		System.out.print("Original queue: ");
		myQueue.printQueue();

		// declare and create the array with the same length as the queue size
		int[] array = new int[myQueue.size];
		// challenge: COPY the queue to the array (without dequeuing it)
		Node temp = myQueue.head;
		for(int i = 0; i < myQueue.size; i++)
		{	array[i] = temp.data;
			temp = temp.next;
			System.out.println("Array = " + Arrays.toString(array));
		}
		System.out.print("Final queue: "); myQueue.printQueue();
		
		// moving all queue elements to an array (WHILE loop version)
		int[] move = new int[myQueue.size];
		System.out.println("\nTransferring the queue to an array");
		int index = 0;
		while(!myQueue.isEmpty())
		{	myQueue.printQueue(); // optional, shows how the queue changes
			move[index] = myQueue.dequeue();
			System.out.println("Array = " + Arrays.toString(move)); // optional, shows how the array changes (using an external library/imported class which we're not allowed to use in exams)
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


public class QueueTest
{
	
	public static void main (String[] args)
	{
		Queue myQueue = new Queue();
		myQueue.printQueue();
		myQueue.enqueue(5);	myQueue.printQueue();
		myQueue.enqueue(6);	myQueue.printQueue();
		myQueue.enqueue(7);	myQueue.printQueue();
	}
}


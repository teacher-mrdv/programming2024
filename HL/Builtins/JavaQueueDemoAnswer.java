import java.util.LinkedList;
import java.util.Queue;

// Hint: read https://www.digitalocean.com/community/tutorials/java-queue

public class JavaQueueDemoAnswer
{
    public static void main(String[] args)
    {
        System.out.println("Java QUEUE\n");
        Queue<String> q = new LinkedList<>();
        System.out.println("enqueueing Ed, Anne, Joel, Quesadilla, Darla, Jose:");

        // enqueue the strings: Ed, Anne, Joel, Quesadilla, Darla, Jose
        q.add("Ed"); q.add("Anne"); q.add("Joel"); q.add("Quesadilla");
        q.add("Darla"); q.add("Jose");
        
		// output the size of the queue q (6)
        System.out.println(q + " size(): " + q.size());
        
        // output the head of the queue, without dequeuing it
        System.out.println("head of the queue: " + q.peek());
        System.out.println("Queue status: " + q);
        // dequeue the head of the queue q and output it (Ed)
        
        System.out.println("dequeue: " + q.remove());
        System.out.println("Queue status: " + q);
        // use a loop to dequeue and print each string of the queue q
		while(!q.isEmpty()) {
			System.out.println("Dequeue: " + q.remove());
			System.out.println("Queue status: " + q);
        }
		
    }
}

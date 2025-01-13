package Collection_Queue;
import java.util.LinkedList;
import java.util.Queue;
/*
 * Inserting element  at the end of the list.
 * Deleting element from  the start of the list.
 */

public class Queue_LinkedList {
	public static void main(String[] args) {
	// [Queue->Interface        LinkedList->Class]     
		Queue<String> queue=new LinkedList<>();
		queue.add("Apple");
		queue.add("Mango");
		queue.add("Grapes");
		queue.add("Avacoda");
		System.out.println("Queue List: "+queue);
		//To get size of the Queue
		System.out.println("Queue Total Size: "+queue.size());
		//To get the peek value from  a Queue
		System.out.println("Peek Value of Queue: "+queue.peek());
		//To Check if the element is present in that Queue
		System.out.println("Queue includes Fruit 'Apple'?: "+queue.contains("Apple"));
		//clearing the queue
		queue.clear();
	}
}

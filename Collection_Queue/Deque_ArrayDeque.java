package Collection_Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
public class Deque_ArrayDeque {
	public static void main(String[] args) {
		Deque<String> d=new ArrayDeque<>();
		d.addFirst("1");
		d.addFirst("2");
		String f=d.removeFirst();
		String l=d.removeLast();
		//Displaying the Deque
		System.out.println("First:"+f+" Last:"+l);
		Deque<String> d1=new LinkedList<String>();
		d1.add("Happy New Year 2025");
		d1.addFirst("Head");
		d1.addLast("Tail");
		d1.push("adding using push");
		//offer add the element at the last
		d1.offer("adding at the last using offer");
		//add at the first
		d1.offerFirst("add using First");
		for(Iterator itr=d1.iterator();itr.hasNext();) 
		{
			System.out.println(itr.next());			
		}
		d1.removeFirst();
		d1.removeLast();
		System.out.println("Deque after removing "+"first and last"+d1);
		
	}

}



package Collection_List;
import java.util.*;
//Stack work on the principle of Last In First Out(LIFO) in addition to push and pop.
// 5 Operations->1.Push,2.Pop,3.Peek,4.Empty,5.Search
//pop->To remove an element on the top of the stack (LIFO)
//push->pop->To push an element on the top of the stack 
//Peek->Display Element at the top of the stack
//Search->Searching the element in the stack based on LIFO
//Empty-> Returns True if nothing on top of the stack (if it's empty) else False


public class Collection_Stack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		//Insertion of elements
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("The Stack List is: "+s);
		//Peek the element
		System.out.println("The peek value is: "+s.peek());
		//BOTH SEARCH IS DIFF
		//Search the elements for Element
		int t=s.search(1); //Seaching based on LIFO Position -> Returns the 1 Position Element //Position starts from 1
		System.out.println("The Stack Search  Element is: "+t);
		//Searching the element for Position -> Returns First Position Value
		System.out.println("The Searched Stack Position is: "+s.search(1));
		//Search the elements that is not in stack ->returns -1
		System.out.println("The Search  Element that is not present in the Stack returns: "+s.search(41));
		
		//To check if the stack is Empty.
		while(!s.isEmpty()) { //s.not 
			//Poping the element from the stack
			System.out.println("Poping out elements:");
			System.out.println(s.pop());
		}
		
	}

}

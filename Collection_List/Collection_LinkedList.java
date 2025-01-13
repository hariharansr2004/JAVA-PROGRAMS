package Collection_List;

import java.util.Collections;
import java.util.LinkedList;

/*
 * LinkedList implements LinkedList Data Structure where the elements are not stored in continuous location.
 * Every element is a seperate object with data part and address part.
 * The elements are linked using pointers and address and each elements is known as node.
 * we don't need to declare size
 * 
 * 
 * Disadvantages:
 * 1.Node cannot be accessed directly instead we need to start from head and follow through the link to reach the node.
 * 2.It allows primitive data type
 * 3.It cannot be stored continuously.
 * 
 */
public class Collection_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> arr=new LinkedList<>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.remove(0);
		System.out.println(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println(arr);//print each iteration values and again print whole list
		
		//Sorting LinkedList
		Collections.sort(arr);
		System.out.println("Sorted Array:" +arr);
		
		//Reversing LinkedList
		Collections.reverse(arr);
		System.out.println("Reversed Array:" +arr);
		
		//Shuffling the LinkedList
		Collections.shuffle(arr);
		System.out.println("Shuffled Array:"+arr);
		
		//Checking if the array is empty or not
		System.out.println("Is the array is Empty?"+arr.isEmpty());
		
		arr.addAll(arr);
		System.out.println("Add the same array with the array :"+arr);
		System.out.println("Remove particular index element:"+arr.remove(1));
		System.out.println(arr);
		System.out.println("Remove Last index element:"+arr.removeLast());
		System.out.println(arr);
		
	}

}

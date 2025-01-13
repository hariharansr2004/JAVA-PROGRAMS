package Collection_List;
import java.util.Vector;
/*
 * Vector implements Growable Array of Objects.
 * It will Grow or Shrink based on its size.
 * Vector is Synchronized
 * It stores all datatypes
 */
public class Collection_Vector {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		System.out.println("The Vector List  is "+v);
		//Insert an element at index -> (value,index)
		v.insertElementAt(0,1);
		System.out.println("The Vector Element is "+v);
		//remove element at first index ->(from specific position or index)
		v.removeElementAt(2);
		//Displaying the first element 
		System.out.println("The vector element is"+v.firstElement());
		//print the element of vector
		System.out.println("Values are: ");
		for(int i:v) {
			System.out.println(i);
		}
	}

}

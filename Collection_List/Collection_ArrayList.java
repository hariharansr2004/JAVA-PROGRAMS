package Collection_List;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Collections Framework:
 *  Contains interfaces,classes,iterators to implement various Data Structures and Algorithms.
 *  There are 3 Types of Collection Interface:List,Set,Map.
 *  ArrayList: ArrayList is a Class
 *  ->Part of collections framework and it provides us dynamic arrays in java. <Important>
 *  ->Lower than Standard Array.
 *  Advantages:
 *    No need to define the size when creating ArrayList
 *    Automatically adjusts its capacity as elements are added or removed.
 *    ArrayList allows randomly access the list
 *    Cannot be used for primitive data-types like int,float,Char etc. So,we need Wrapper Classes.
 *    ArrayList is not Synchronized.
 *    It allows Duplicate values because list allows duplicates but it maintains the order of the object[Ordered Collection].
 *     
 *  When ArrayList Can remove Duplicates? <Important>
 *    ->Create a LinkedHashSet from this ArrayList it will remove the duplicates.
 *    ->Convert this LinkedHashSet back to ArrayList.
 *    ->The Second ArrayList contains the elements with duplicates removed
 *    
 */
public class Collection_ArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implementation<type>=new implementation<type>();
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Dairy Milk");
		obj.add("Kit-Kat");
		System.out.println(obj);
		
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Milky Bar");
		obj1.add("5 Star");
		System.out.println(obj1);
		
		//Joining Two ArrayList(addAll())
		ArrayList<String> a=new ArrayList<String>();
		a.addAll(obj);//addAll()->allows only one arguments.
		a.addAll(obj1);
		System.out.println("Joined Array: "+a);
		System.out.println("----------------------");
		
		//Sorting
		Collections.sort(a); // we need to import collections interface to sort
		System.out.println("Sorted Array: "+a);
		System.out.println("----------------------");
		
		//Looping Through ArrayList to find length
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));//objectname.get() // 1.it will return the list values 2.if we provide i it will give the index.
		}
		System.out.println("----------------------");
		
		//Looping Through for-each
		for(String i:a) {
			System.out.println(i);//print each iteration values and again prints the Whole List
		}
		System.out.println(a);
		System.out.println(a.size());
		System.out.println("----------------------");
		
		//Inserting an element in ArrayList
		System.out.println("Inserting Element:");
		a.add(0,"Perk");
		System.out.println(a);
		//Access an Item
		System.out.println("Accessing Element:");
		System.out.println(a.get(0));
		//Changing an Item
		System.out.println("Changing the Element:");
		System.out.println(a.set(0, "Ferro Rocher"));//returns only the old value of the index
		System.out.println(a);//to see whether  it's changed or not  we need to print it
		//Removing an Item
		System.out.println("Removing the Element:");
		System.out.println(a.remove(2));
		System.out.println("After Removing the Element 2:");
		System.out.println(a);
		
		//Remove all the elements from the user
		System.out.println("Removing all the elements from ArrayList:");
		a.clear();

	}

}

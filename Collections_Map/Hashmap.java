package Collections_Map;
import java.util.HashMap;
import java.util.Map;

/*
 * Map is an interface 
 * Hashmap is a class used to implement the frameworks that stores data in key-value pairs that allows for efficient retrival.
 */
public class Hashmap {
	public static void main(String[] args) {                         
	  //[Map->Interface;             Hashmap->Class]
		Map<String,Integer> nums=new HashMap<String,Integer>();
		
		//Inserting Element to the Map-> put
		nums.put("one",1); //order shouldn't be changes
		nums.put("two",2);
		nums.put("three",3);
		System.out.println("Map: "+nums);
		
		//Access Key
		System.out.println("Keys: "+nums.keySet());
		
		//Access values on the map
		System.out.println("Values: "+nums.values());
		
		//How to Access both the values?
		//Access Entries on the map -> Returns in List Form
		System.out.println("Entries: "+nums.entrySet()); 
		
		//Remove Element from the Map
		System.out.println("Before Removing: "+nums);
		int val=nums.remove("two");
		System.out.println("Removed Value: "+val);
		System.out.println("After Removing: "+nums);

		//Cloning the HashMap
		HashMap<String,Integer> obj=new HashMap<String,Integer>(nums);
		obj.put("four", 4);
		obj.put("five", 5);
		System.out.println("HashMap List: "+obj);
	}
}

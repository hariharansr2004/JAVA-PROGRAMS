package Collections_Map;

import java.util.HashMap;

//Hashing Technique-> 2.HashMap table
public class HashMapUsingArray {
//Method to create Hashmap from array
	static void createHashMap(int arr[]) {
		//empty HashMap
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		//traverse through the given array
		for(int i=0;i<arr.length;i++){
			//check if the element is present
			Integer c=hmap.get(arr[i]);
			//If this is the first occurence of the element
			if(hmap.get(arr[i])==null) {
				hmap.put(arr[i], 1);
			}
			else{
				//If the element is already exist in the HashMap then increment by 1
				hmap.put(arr[i], ++c);
			}
		}
		System.out.println(hmap);
	}
	public static void main(String[] args) {
	 int arr[]= {10,20,10,5,5,20,70,10,30,40,50};
	 createHashMap(arr);
	}
}

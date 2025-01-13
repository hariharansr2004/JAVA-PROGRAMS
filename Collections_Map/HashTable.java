package Collections_Map;
import java.util.Hashtable;

//Hashing Technique-> 1.Hashtable(Key-Value) based method
public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer,String> val=new Hashtable<Integer,String>();
		//Key-Value Pair
		val.put(1,"Hari");
		val.put(2,"Pradee");
		val.put(3,"Kumaravel");
		val.put(4,"Saran");
		//Hashing converts large no.of.strings into smaller strings
		System.out.println(val);
		//contains lot of inbuilt functions refer in websites
		
	}
}

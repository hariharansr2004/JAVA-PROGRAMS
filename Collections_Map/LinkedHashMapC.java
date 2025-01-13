package Collections_Map;

import java.util.LinkedHashMap;

public class LinkedHashMapC {

	public static void main(String[] args) {
		LinkedHashMap<String,String> val=new LinkedHashMap<String,String>();
		val.put("1","Hari");
		val.put("2","Pradee");
		val.put("3","Kumaravel");
		val.put("4","Saran");
		System.out.println(val);
		System.out.println("Getting Key Value: "+val.get("1"));
		System.out.println("Size of HashMap: "+val.isEmpty());
		System.out.println("Is HashMap is Empty: "+val.isEmpty());
		System.out.println("Contains Key --> Two: "+val.containsKey("2"));
		System.out.println("Contains Value -->Pradee : "+val.containsValue("Pradee"));
		System.out.println("Delete the Element : "+val.remove("2"));
		System.out.println(val);
	}

}

package Collections_Set;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
//Set is a Collection of Unordered Collection of objects in which duplicate values cannot be stored
//Thread Safe and Doesn't maintain any order
//Hashset is a collection of items where every item is unique that uses hash table for storage
enum f{orange,apple,bannana,mangoes};
public class HashSetandTreeSet {
	public static void main(String[] args) {
		int count[]= {22,22,21,25,24};
		Set<f> set1;
		set1=EnumSet.of(f.orange,f.apple,f.bannana,f.mangoes);
		System.out.println("Enums Elements: "+set1);
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(26);
		set.add(27);
		set.add(28);
		set.add(29);
		set.add(30);
		System.out.println("Added Elements: "+set);
		try {
			for(int i=0;i<5;i++) {
				set.add(count[i]);
			}
			System.out.println("After looping: "+set);
			set.remove(30);
			System.out.println("After removing the value from set: "+set);

			int check=26;
			int check1=40;
			//Contains to check element in the set
			System.out.println("Contains: "+set.contains(check));
			System.out.println("Contains: "+set.contains(check1));
//			---------------------------------------------------
			
			SortedSet<Integer> sortedset= new TreeSet<Integer>(set);
			System.out.println(sortedset);
			System.out.println("First Element of the Set is: "+(Integer)sortedset.first());
			System.out.println("Last Element of the Set is: "+(Integer)sortedset.last());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}

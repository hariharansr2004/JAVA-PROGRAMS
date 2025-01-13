package Inheritance;
/*
 * Hybrid Inheritance is a combination of two or more types of inheritance in a class Hierarchy
 *  single,multiple,hierarchical can be used in this inheritance
 */
class grandfather{
	public void showG() {
		System.out.println("He is a grand father");
	}
}
class father extends grandfather{
	public void showF() {
		System.out.println("He is a father");
	}
}
class son extends father{
	public void showS() {
		System.out.println("He is a Son");
	}
}

public class HybridInheritance extends father// if we put son it will only give son and inherited things
{
	public void showD() {
		System.out.println("She is a Daughter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son obj1=new son();
		obj1.showS();
		obj1.showF();
		obj1.showG();
		System.out.println("-----------------------------");
		HybridInheritance obj2=new HybridInheritance();
		obj1.showS();
		obj2.showD();
		obj2.showF();
		obj2.showG();
		
		

	}

}

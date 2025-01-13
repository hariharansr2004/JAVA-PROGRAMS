package AbstractionandInterface;
/*Interface is similar to a class but it contains only abstract methods. 
 * It is a total abstraction class that must implement all abstract methods declared in the interface. Interface can also have variables but it's static and final.
 * By interface we can support functionality of multiple inheritance.
 * It is used to achieve abstraction
 * It is used to prevent loose coupling(data leakage)
 * To inherit an interface we use implements keyword similar like extends keyword
 * its more secured than abstract class
 * we should always create methods in the class only not in interface part
 * we can't create objects in an interface
 * Understanding interface eg in real life usecase:
 * In a project They will give you the design in interface we have to implement the code part*/
interface printable{
	int age=10;//static and final
	void print();//abstract method
}

public class Interface implements printable{
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj=new Interface();
		//age=20;//it's final by default so we cant change the value
		obj.print();
		System.out.println(printable.age);//accessing variable directly by interface name since it's static and final.
		
		

	}

}

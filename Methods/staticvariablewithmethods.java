package Methods;
//we can access the object  via method for calling variables
//we directly access the object by calling variable
public class staticvariablewithmethods {
	private static int count=20;

	public static void  print() {
		// TODO Auto-generated method stub
		System.out.println(count);
	}
public static void main (String[] args) {
	System.out.println("case1: without creating objects we can call static method by --> classname.methodname()");
	staticvariablewithmethods.print();//
	System.out.println("---------------------------------");
	System.out.println("case2:how to access a static variable without using method --> by directly printing it");
	System.out.println(count);
	System.out.println("---------------------------------");
	System.out.println("case3: we can also able to use static methods and variable by creating object");
	staticvariablewithmethods obj=new staticvariablewithmethods();
	obj.print();// calling static method by creating object
	System.out.println("---------------------------------");
	System.out.println("case 4:If we calling  static variable via object it's called as object cloning.");
	System.out.println("       this is called object cloning and we should not call the static variable by using object");
	System.out.println(obj.count); 
	
}

}

package Methods;
/*
 * 1. Java Local Variables:
 * Local variables are declared in methods, constructors, or blocks.
 * Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block.
 * Access modifiers cannot be used for local variables.
 * Local variables are visible only within the declared method, constructor, or block.
 * Local variables are implemented at stack memory internally.
 * There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.
 *
 *2.Java Instance variables:
 * Instance variables are declared in a class, but outside a method, constructor or any block.
 * Instance variables are created when an object is created with the use of the keyword ‘new’ and destroyed when the object is destroyed.
 * Access modifiers can be given for instance variables.
 * The instance variables are visible for all methods, constructors and block in the class. 
 * Instance variables have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null. Values can be assigned during the declaration or within the constructor.
 * Instance variables can be accessed directly by calling the variable name inside the class.
 *
 *3.Java Static variables:
 *Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
 *There would only be one copy of each class variable per class, regardless of how many objects are created from it.
 *Static variables are stored in the static memory. 
 *Static variables are created when the program starts and destroyed when the program stops.
 *Visibility is similar to instance variables. However, most static variables are declared public since they must be available for users of the class.
 *Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. 
 *Static variables can be accessed by calling with the class name ClassName.VariableName.
*/
public class LocalInstanceStaticVariables {
	static int a=10;//static variable
	public int d=40; //this is also an instance variable
	public  int method(int val)//local variable
	{
		int b=val+10;
		return b;	
	}
	public static void main(String[] args) {
		int c=30;//local variable since it is inside the main method
		LocalInstanceStaticVariables obj=new LocalInstanceStaticVariables();
		System.out.println("static variable: "+a);
		System.out.println("local variable: "+obj.method(10));
		System.out.println("instance variable: "+c);
	}

}


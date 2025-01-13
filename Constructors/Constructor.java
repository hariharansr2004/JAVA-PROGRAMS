package Constructors;
/* Constructor is a special method that is used to initialize the object
 * Constructor Properties:
 * 1.it should have same name as class name
 * 2.No return type
 * 3.it is used for initialization of objects
 * 4.Automatic invocation (knowing a thing that will happen) example:if we apply brake car will stop
 * constructor is invoked automatically when an  object is created
 * Java provides default constructor when a object is created
 * Types: 1.Default 2.Parameterized
 */
public class Constructor { 
	int regno;
	String name;
	String dept;
	
	Constructor()//default constructor Note:we must not pass values in default constructor
	{
		this.regno=regno;//this refers to current value of the variable
		this.name=name; //we should use same name which we mentioned in instance variables for the fields
		this.dept=dept;
	}
	void display(int regno,String name,String dept) {
		System.out.println("The details of the person is "+name+" "+regno+" from "+dept);
		
	}

	public static void main(String[] args) {
		Constructor obj1=new Constructor(); //we can't pass the values here in default constructor
		Constructor obj2=new Constructor();
		Constructor obj3=new Constructor();
		obj1.display(21500169,"Hariharan S","IT");
		obj2.display(21500212,"Dinesh M","IT");
		obj3.display(21003343,"Kumaravel","IT");
		
		
	}

}

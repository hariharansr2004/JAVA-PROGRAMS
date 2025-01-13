package Inheritance;
/* It's a type of inheritance that allows multiple classes to inherit from single parent class
 * 
 */
class Baseclass{
	int parentnum=10;

}
class Subclass1 extends Baseclass{
	int childnum1=1;
	
	
}
class Subclass2 extends Baseclass{
	int childnum2=2;
	
}
class Subclass3 extends Baseclass{
	int childnum3=3;
	
}
public class HierarichicalInheritance {

	public static void main(String[] args) 
	// since we accessing same base class for multiple classes we should create object for each class
	{
		// TODO Auto-generated method stub
		Subclass1 obj1=new Subclass1();
		Subclass2 obj2=new Subclass2();
		Subclass3 obj3=new Subclass3();
		System.out.println("ParentNum="+obj1.parentnum);
		System.out.println("ParentNum*childnum1="+obj1.childnum1*obj1.parentnum);
		System.out.println("ParentNum*childnum2="+obj2.childnum2*obj2.parentnum);//obj1.parentnum (this also works)
		System.out.println("ParentNum*childnum3="+obj3.childnum3*obj3.parentnum);//obj1.parentnum
	}

}

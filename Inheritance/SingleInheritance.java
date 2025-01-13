package Inheritance;
/*Inheritance: (constructor:super:overriding)
One class that is allowed to inherit the immediate child class or parent class
How we will implement inheritance? by using extends keyword
What's Super class?-->The class whose features are inherited is known as super class or base class or parent class
What is Sub class? The class that inherits other class is called subclass or derived class or extended class or child class
what's the use of inheritance?
1. Code reusability-->(reusing the field and method of existing class)
2.Method Overriding -->Run time polymorphism
3.Abstraction(hiding the non-fuctional details and providing only functionalities

  Super is a keyword that reference parent class or super class or subclass in java (it only returns parent object)
  in short in return the objects that represents from parent class
*/

//skeleton class
class Test1{
	public int gear;// to access the child class
	public int speed;
	Test1(int gear,int speed){
		this.gear=gear;
		this.speed=speed;
	}
	/*public void speedup(int increment){
		speed+=increment;

	}
	public void applybrake(int increment){
		speed-=increment;
	}*/
	public String toString() { //toString is a keyword which will return any data as text
		return("no.of.gears"+gear+"\n"+"speed of bicycle"+speed);
	}
}

	//Derived Class
	class Mountainbike extends Test1{
		public int seatHeight;
		Mountainbike(int gear, int speed,int startHeight) {
			super(gear, speed);//returns parent object
			seatHeight=startHeight;
		}
		@Override
		public String toString() //same method in parent class
		{
			return(super.toString()+"Seat Height is"+seatHeight);
		}
		
	}
	
// we should not use main method inside	in skeleton class
//Stub class

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mountainbike m=new Mountainbike(3,233,5);
		System.out.println(m.toString());

	}

}

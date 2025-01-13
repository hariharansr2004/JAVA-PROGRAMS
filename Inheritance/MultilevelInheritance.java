package Inheritance;
//skeleton class
class shape//super class
{
	public void display() {
		System.out.println("Inside shape method");
	}
}

class rectangle extends shape //subclass1
{
	public void area() {

		System.out.println("Inside rectangle method");
	}
	
}
class cube extends rectangle//subclass2
{
	public void volume() {

		System.out.println("Inside cube method");
	}
}

//stub class
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube c =new cube();// all the features will come in cube(including shape,rect.
		c.display();
		c.area();
		c.volume();

	}

}

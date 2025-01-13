package Constructors;
public class ConstructorOverloading {
		int id;
		String name;
		String dept;
		//Performing Constructor Overloading
		ConstructorOverloading() {
			this.name=name;
		}
		ConstructorOverloading(int i,String n){
			this.id=i;
			this.name=n;
		}
		ConstructorOverloading(int i,String n,String dept){
			this.id=i;
			this.name=n;
			this.dept=dept;
		}
		//Method Overloading
		void disp(String name) {
			System.out.println("This is default constructor: "+name);
		}
		void disp() {
			System.out.println("Parameterized Constructor:");
			System.out.println("Student Id: "+id+" StudentName: "+name);
		}
		void disp(int id,String name,String dept) {
			System.out.println("Parameterized Constructor with diff args:");
			System.out.println("Student Id: "+id+" StudentName: "+name+" Student Dept: "+dept);
		}
	public static void main(String[] args) {
		ConstructorOverloading a=new ConstructorOverloading();
		ConstructorOverloading b=new ConstructorOverloading(10,"David");
		ConstructorOverloading c=new ConstructorOverloading(1,"kumar","IT");
		a.disp("Harixx_s7");
		b.disp();
		c.disp(c.id,c.name,c.dept); //passing constructor in input field for the method to print the result.
		
	}
}
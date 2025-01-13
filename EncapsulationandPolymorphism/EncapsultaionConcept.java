package EncapsulationandPolymorphism;
//https://youtu.be/ceDeyCn2Pfo?si=9-zceosb_paIpqKK
//Binding data members and methods in to a Single Entity.
//Main purpose of Encapsulation->To make our data more secure
//Data members-> Private //Methods->Public
//Getters and Setters
class person {
	int mark=90;//This instance variable is openly available so anyone can access and change the value of variable 
//leads to change of our confidential data's. Thus,it results in security issues. So to prevent this we are using private access specifier.
//	private-> it allows the data memebers,methods,constructors to be accessed only within the class
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;//why we are using this->to determine whether it's local or instance variable
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
//Driver Class
public class EncapsultaionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.mark=50;// instance variable value is changed by oustider. So to prevent this we are using private access specifier.
		System.out.println("Mark after variable is accessed:" +p.mark);
		p.setName("Hari");
		p.setAge(30);
		//Using Method to get the values from variables
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
	}

}

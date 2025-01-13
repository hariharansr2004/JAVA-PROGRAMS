package Constructors;

public class ParameterizedConstructor {

	String Name;
	long reg;
	String dept;
	ParameterizedConstructor(String n,long id,String d)
	// we should give in correct order of sequence which we mentioned in instance variable and also same data-type
	{
		Name=n;//In parameterized constructor we can either use with this keyword or without to initialize the object
		reg=id;
		dept=d;
	}
	void display() {
		System.out.println("The Department of "+Name+" and "+reg+" is "+dept);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor obj= new ParameterizedConstructor("Hariharan S",21220016,"IT");
		obj.display();
		

	}

}

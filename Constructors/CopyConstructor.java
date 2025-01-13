package Constructors;
/* CopyConstructor is defined as a constructor used to create a new object by copying values from an existing object of the same class
 Note:Java doesn't Support copy constructor but it can be implemented manually
 */
public class CopyConstructor {
	int year;
	String Model;
	CopyConstructor(int year,String Model){
		this.year=year;
		this.Model=Model;
	}
	// copy constructor
	CopyConstructor(CopyConstructor cc) //to define constructor name within that (constructor name and object name)
	{
		this.year=cc.year;
		this.Model=cc.Model;
	}
	void display() {
	 System.out.println("The model of the car is " + Model+ " and the year is "+year);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor obj=new CopyConstructor(2004,"Audi A6");// we can also pass the arguments same like parameterized.
		CopyConstructor obj2=new CopyConstructor(2005,"Audi A8");
		obj.display();
	}

}

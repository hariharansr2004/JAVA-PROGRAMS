package Inheritance;
class departments{
	String depts="SCOFT";
}
class department1 extends departments{
	String dept1="IT";
}
class department2 extends departments{
	String dept2="CSE";
}
class department3 extends departments{
	String dept3="AIDS"; 
}
class department4 extends departments{
	String dept4="ECE"; 
}

public class Myhierarchalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		department1 obj1=new department1();
		department2 obj2=new department2();
		department3 obj3=new department3();
		department4 obj4=new department4();
		
		System.out.println(obj1.dept1+" The dept is under "+ obj1.depts);
		System.out.println(obj2.dept2+" The dept is under "+ obj2.depts);
		System.out.println(obj3.dept3+" The dept is under "+ obj1.depts);
		System.out.println(obj4.dept4+" The dept is under "+ obj1.depts);
		
		//the objects that is not in the method can be accessed with print statements
		
		

	}

}

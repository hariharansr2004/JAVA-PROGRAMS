package Inheritance;

class fruits{
	String a="apple";
}
class fruit1 extends fruits{
	String b="banana";

}
class fruit2 extends fruit1{
	String c="mango";
}

public class MymutilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruit2 obj2=new fruit2();
		System.out.println(obj2.a);


	}

}

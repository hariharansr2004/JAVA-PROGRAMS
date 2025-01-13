package InnerClass;
/*In java It's also possible to nest classes (A class within a class) 
 * The purpose of nested class is to group classes that belong together which makes your code more readable and maintainable
 * To access the inner class, Create Object of Outer class and and then create object of the inner class
 * step1->create outer class object
 * step-2> OuterClassName.InnerClassName InnerClassObject=OuterClassObject.new InnerClassName()
 */
class outerclass{
	int x=10;
	class innerclass{
		int y=20;
	}
}
public class JavaInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass obj1=new outerclass();
		//Syntax: OuterClassName.InnerClassName InnerClassObject=OuterClassObject.new InnerClassNamwe()
		outerclass.innerclass obj2=obj1.new innerclass();
		System.out.println(obj2.y+obj1.x);
	}

}

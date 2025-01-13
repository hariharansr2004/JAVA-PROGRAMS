package AbstractionandInterface;
/* https://youtu.be/7W_8N4M0Qg4?si=Fktn189KXsgfVv2U
 * Abstract class is a restricted class that cannot be used to create objects.(It can be accessed and inherited from another class)
 * Abstract Method can be used in abstract class and doesn't have a body(declaration). The body(definition) should be provided by sub-class.
 * we can also use abstract and normal method in abstract class.
 * we should use abstract keyword for class and interface
 * Abstract class must have at-least one abstract method
 * we can indirectly create  objects for abstract class by extending the class
 * 
 */
abstract class animal
{
	public abstract void animalsound();// abstract method?[methods having only declaration. (Body of the method should be in sub class only)]
	public void sleep() 
//regular method or concrete method (we must define it otherwise it will raise error)
	{
		System.out.println("Sleep");
	}
	
}
class pig extends animal//sub-class
{
	 public void animalsound() {
		System.out.println("weee-weee");
	}
}
public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pig obj=new pig();//To access the abstract class we can done it by creating object for extended class
		obj.animalsound();
		obj.sleep(); 

	}

}

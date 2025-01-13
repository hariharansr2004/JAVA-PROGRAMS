package AbstractionandInterface;
interface firstinterface{
	 public void first();
// if we use public for methods when inside an interface then it can be accessed by everywhere
}
interface secondinterface{
	public void second();
}
public class Interfaceexamples implements firstinterface,secondinterface {
	public void first() {
		System.out.println("Accesing 1st method using interface");
	}
	public void second() {
		System.out.println("Accesing 2nd method using interface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceexamples obj=new Interfaceexamples();
		obj.first();
		obj.second();

	}

}

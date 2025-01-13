package Methods;

public class CanMainbeOverloaded {
	public static void main(String[] args) {
		System.out.println("Original Main Method");
	}
	
	public static void main(Double[] args) {
		System.out.println("Overloaded Main Method");
	}
	
	public static void main(int args) {
		System.out.println("Overloaded Main Method");
	}
}
//main can be overloaded?
//	Yes, We can overload the main method in java but JVM only calls the original main method, it will never call our overloaded main method.
//main can be overridden?
//	No, we cannot override main method of java because a static method cannot be overridden.
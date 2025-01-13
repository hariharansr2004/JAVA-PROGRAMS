package Exceptions;

public class OneTryManyCatch {
	public static void main(String[] args) {
	try {
		int a[]=new int[5];
		System.out.println(a[0]);
	}
	
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception Occurs");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index Out Of Bound Exception Occurs");
	}
	catch(Exception e) {
		System.out.println("Parent Exception Occurs");
	}
	System.out.println("Rest of Code");
	}

}

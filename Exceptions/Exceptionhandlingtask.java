package Exceptions;

public class Exceptionhandlingtask {
	
	public  void odd(int num) {
		if (num%2==1) {
			System.out.printf("The given number %d is odd",num);
		}
		else {
			throw new IllegalArgumentException("the number is not a even num");
		}	
	}
	public  void eve(int num) {
		if (num%2==0) {
			System.out.printf("The given number %d is even",num);
		}
		else {
			throw new IllegalArgumentException("the number is not a odd num");
		}	
	}
	

	public static void main(String[] args) {
		Exceptionhandlingtask obj=new Exceptionhandlingtask();
		try {
			obj.odd(455);
			obj.eve(455);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception Occurs");
		}
		catch(Exception e) {
			System.out.println("Error Occured "+e);
		}
		
		finally {
			System.out.println("\nProgram ends");
		}

	}
}

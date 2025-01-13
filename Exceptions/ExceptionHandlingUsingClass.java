package Exceptions;

class InvalidAge extends Exception{
	public InvalidAge(String str) { //constructor
		super(str);   //super(str)-> throw new InvalidAge("Age is not valid to vote");
	}
}
public class ExceptionHandlingUsingClass {
	static void validate(int age) throws InvalidAge{
		if(age<18){
			throw new InvalidAge("Age is not valid to vote");
		}
		else {
			System.out.println("You're eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(14);
		}
		catch(InvalidAge ex) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured"+ex);
		}
		System.out.println("Rest of the code");
	}
}

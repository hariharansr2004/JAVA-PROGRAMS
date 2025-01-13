package Exceptions;

public class HighlevelExceptionHandling {
	public static void trynumber(int n) {
		try {
			checkEvenNumber(n);
			System.out.println(n+" is Even");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	
	public static void checkEvenNumber(int number) {
		if(number%2==1) {
			throw new IllegalArgumentException(number+" is Odd");
		}
	}
	
	public static void main(String[] args) {
		int n=1; //try 10.5,10,17
		trynumber(n);
		int g=8;
		checkEvenNumber(g);	
	}
}

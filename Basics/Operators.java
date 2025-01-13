package Basics;
import java.util.*;

public class Operators {

	public static void main(String[] args) {

		  int a = 10;
	      int b = 20;
	        
	        System.out.println("Relational Operators");
	        
	        System.out.println("(a == b) : " + (a == b));              // Equal to
	        System.out.println("(a < b) : " + (a < b));                // Less than
	        System.out.println("(a > b) : " + (a > b));                // Greater than
	        System.out.println("(a <= b) : " + (a <= b));              // Less than or Equal to
	        System.out.println("(a >= b) : " + (a >= b));              // Greater than or equal to
	        System.out.println("(a != b) : " + (a != b));              // Not equal to
	        
	        System.out.println("\nLogical Operators");
	        
	        System.out.println("(a < b) && (a == b) : " + ((a < b) && (a == b)));      // && -- AND Operator
	        System.out.println("(a > b) || (a != b) : " + ((a > b) || (a != b)));      // || -- OR Operator
	        System.out.println("!(a == b) : " + !(a == b));                            // !  -- NOT Operator

	}

}

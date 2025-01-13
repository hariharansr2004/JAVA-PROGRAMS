package Basics;
import java.util.*;
public class Perfectsquare {
		
   public static String perfsquare(int n) {
		int a=(int)Math.sqrt(n);
		if(n==a*a) {
			return "Perfect Square";
		}
		else {
			return "Not a Perfect Square";
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println(perfsquare(n));

	}

}

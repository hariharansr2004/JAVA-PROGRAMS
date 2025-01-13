package Basics;
import java.util.*;

public class OddorEven {
	 
	public static String findoe(int n) {
		if(n%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findoe(n));
	}

}


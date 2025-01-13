package Basics;
import java.util.*;


public class Leaptask {
	
	static String leapornot(int year) {
		if (year%4==0 && year%100!=0 ) {
			return "leap year";
		}
		else if(year%400==0) {
			return "leap year";
		}
		else {
			return"not a leap year";
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		System.out.println(leapornot(year));
		
		
	
		

	}

}

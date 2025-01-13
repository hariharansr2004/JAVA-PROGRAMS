package Basics;
import java.util.*;

public class Ifelseprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age>=18) {
			System.out.println("You are eligible");
		}
		else if (age>=60) {
			System.out.println("You are eligible for ballot");
		}
		else {
			System.out.println("You are not eligible");
		}

	}

}

package Basics;

import java.util.Scanner;

public class Sumofalldigits {
	static int mymethod(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=rem+sum;
			num=num/10;
			
		}	
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(mymethod(num));
	}

}

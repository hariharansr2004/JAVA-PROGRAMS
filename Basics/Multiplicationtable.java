package Basics;
import java.util.*;
public class Multiplicationtable {
	 public static void table(int n) {
		 for(int i=1;i<=10;i++){
			 System.out.println(n+" * "+i+" = "+n*i);
			
		 }

		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		table(n);
	}

}

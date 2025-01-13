package Basics;
import java.util.*;
public class Loops {
	public static void simplefor() {
	 for(int i=0;i<=10;i++) {
	        	i=i++;
	        	System.out.println(i);
	        }
		
	}
	
	static void nestedfor() {
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
	        }
	}
	static void foreach() {
		int arr[]= {10,20,30,40,50};
		for(int element:arr) {
			System.out.println("element"+element);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simplefor();
		nestedfor();
		//looping.foreach();
		}

	}



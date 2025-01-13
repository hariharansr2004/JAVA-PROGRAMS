package SwitchandEnums;

import java.util.Scanner;

//switch-> it's a statement that select and execute one block from multiple blocks. 
//it work by matching the value from the values.
//Eg:Days of a week
public class SwitchSample {
	public static void main(String[] args) {
		System.out.println("Enter a month: ");
		Scanner sc =new Scanner(System.in);
		String a=sc.nextLine().toUpperCase();
		switch(a) {
		case "JAN"-> System.out.println("31 Days");
		case "FEB"-> System.out.println("28 Days");
		case "MAR"-> System.out.println("31 Days");
		case "APR"-> System.out.println("30 Days");
		case "MAY"-> System.out.println("31 Days");
		case "JUN"-> System.out.println("30 Days");
		case "JUL"-> System.out.println("31 Days");
		case "AUG"-> System.out.println("31 Days");
		case "SEP"-> System.out.println("30 Days");
		case "OCT"-> System.out.println("31 Days");
		case "NOV"-> System.out.println("30 Days");
		case "DEC"-> System.out.println("31 Days");
		}

	}

}

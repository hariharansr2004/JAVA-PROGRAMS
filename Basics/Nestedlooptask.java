package Basics;
import java.util.Scanner;
public class Nestedlooptask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=in.nextInt();
		for(i=a;i>=1;i--)
		{
			for(j=a;j>a-i;j--)
			
				System.out.print(j);
			System.out.println(" ");
			
		}


	}

}



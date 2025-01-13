package Basics;
import java.util.*;
public class Sumofnoddno {
	static int noddno(int n) {
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2==1){
				sum=sum+i;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println(noddno(n));

	}

}

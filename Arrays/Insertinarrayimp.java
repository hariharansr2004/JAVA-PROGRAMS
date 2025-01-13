package Arrays;
import java.util.*;
//for search greater than = pos -1

public class Insertinarrayimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,pos,x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of the array:");
		size=sc.nextInt();
		int a[]=new int[size+1];
		System.out.println("Enter the number of elements:");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position you want to insert");
		pos=sc.nextInt();
		for(int i=(size-1);i>=pos-1;i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("After insertion");
		for(int i=0;i<size;i++){
			System.out.println(a[i]+",");
		}
		System.out.println(a[size]);
	}

}

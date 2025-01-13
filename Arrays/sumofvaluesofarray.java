package Arrays;
import java.util.*;
public class sumofvaluesofarray {
	public int sumofarray(int arr[],int n) {
		int sum=0;
		for (int i=0;i<n;i++) {
			sum=sum+arr[i];			
		}
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sumofvaluesofarray obj=new sumofvaluesofarray();
		System.out.println("Sum of the array is:"+obj.sumofarray(arr, n));
		
	}

}

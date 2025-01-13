package Arrays;
import java.util.*;
public class Averageofarray {
	public int avg(int arr[],int n){
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum/n;
	
		
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size input");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Averageofarray obj=new Averageofarray();
		System.out.println(obj.avg(arr, n));
		
		}
		

	}



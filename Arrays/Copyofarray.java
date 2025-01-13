package Arrays;
import java.util.*;
public class Copyofarray {
	public int[] cpy(int n, int arr[]){
		int cpyarr[]= new int[n];
		for(int i=0;i<n;i++){
			cpyarr[i]=arr[i];
		}
		return cpyarr;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		int n=arr.length;
		System.out.println("enter arr elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Copyofarray obj=new Copyofarray();
		int result[]=obj.cpy(n, arr);
		System.out.println("Copied array:"+Arrays.toString(result));
		
		
	}

}

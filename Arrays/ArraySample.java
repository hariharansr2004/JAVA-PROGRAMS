package Arrays;

import java.util.Arrays;

/*Array are used to store multiple values in a single variable instead of declaring separate variables for each values
 * How to access the element for an array
 we can access the array element by index no changing an array element 
 To change the value of the specific elements refer to the index number
 array length-> to find how many elements an array has,use the length property
 If we access an array out of the array size which is not specified(since array size is finished) 
 It will raise out-of-index error and returns -1 due to backward indexing
---------------------------------------------------------------------------------------------------------------
 How to initialize array value?
 * Type 1-> If we want to store element values in an array use new keyword
 * int[] arr= new int[]{1,2,3} // used in corporates
 * Type 2-> Java allows short-hand declaration for array initialization
 * int[] arr={0,9} (if we declare size in int it will use only that size only)
 * Type 3-> No change in functionality but not on size
 * int arr[]={98,99}
 * Type 4->initializes the array value
 * int arr[]=new int[4]
 * -------------------------------------------------------------------------------------------------------------
 * Arrays.fill-> This method assigns the specified data-type value to each element of the specified range of the specified array
   What is traverse an array?
   In general array are containers that stores multiple variables of the same data type at fixed size at the time of creation
   You can traverse through an array using for loop or enhanced-for which means you can iterate the index using 
   loop starting from 0 to length of the array
   and access element at each index
  
   
   
  */

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		-----------------------------------------
		int a[]=new int[10];
		Arrays.fill(a,10);
		System.out.println(Arrays.toString(a));
	    -----------------------------------------
		//Accessing the array 
		String cars[]=new String[]{"Skoda","mazda","benz"};
		System.out.println(cars[1]);
		*/
		
		int arr[]=new int[10];
		arr[0]=10;
		arr[1]=20;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		System.out.println("Contents of array");
		for(int element:arr) {
			System.out.println(element);
		}
	}
	
}



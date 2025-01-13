package Exceptions;
//Integer.parseInt() -> To convert a string into particular datatype
public class NumberFormatException {

	public static void main(String[] args) {
	try {
		int num=Integer.parseInt("Hi");//If we use 3 it won't raise error since it is Converted to int
		int a=Integer.parseInt("3"); // this code doesn't execute Note:If a exception occured it will directly move to catch block,it wont read next line of code in try block.
		System.out.println(num);
		System.out.println(a); 
	}
	catch(Exception e){
		System.out.println("Number Format Exception");
	}
 }

}

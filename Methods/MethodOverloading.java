package Methods;
import java.util.*;
class MethodOverloading {
	 public int sum(int a, int b) {
		 return a+b;	 
	 }
	 public double sum(double a,double b,double c){
		 return a+b+c;	 
	 }
	 public int sum(int a,int b,int c) {
		 return a+b+c;	 
	 }
	 public String sum(String c,int b,int a) {
		 return a+b+c;	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.sum(10,20,30));
		System.out.println(obj.sum(10,20,30));
		System.out.println(obj.sum("jal",20,30));
	}
}

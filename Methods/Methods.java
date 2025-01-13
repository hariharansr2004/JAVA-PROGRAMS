package Methods;
import java.util.*;
public class Methods {
	static void mymethod(int num1,int num2)
	{
		 int add=num1+num2;
		 int sub=num1-num2;
		 int mul=num1*num2;
		 int div=num1/num2;
		 System.out.println("Addition:"+add);
		 System.out.println("Subtraction:"+sub);
		 System.out.println("Multiplication:"+mul);
		 System.out.println("Division:"+div);
		 System.out.println("------------------------");
		  
	
	}
	

	public static void main(String[] args) {
		mymethod(30,20);
		mymethod(60,40);
		mymethod(50,50);
		
		
	}

}

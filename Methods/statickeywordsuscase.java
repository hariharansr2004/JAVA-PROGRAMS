package Methods;
//static variable is a variable that contains a single copy of the variable and shared among all objects
//static variables are global variable
//If we use static variable it should be used with either with normal or static method
//static variable  should not be used inside main without a method
//If we use static method we can able to pass the value with class name.method name without creating object.
public class statickeywordsuscase {
	static int cube(int x)// static method 
	{
		return x*x*x;
	}

	public static void main(String[] args) {
		//public static int a=10;//static variable (it's wrong since it's used directly without a method)
		//a++;// since its static we can modify the value of variable
		int result=statickeywordsuscase.cube(3);
		System.out.println(result);
		
		

	}

}

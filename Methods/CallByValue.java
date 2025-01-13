package Methods; //Refer Yt:Logic First Tamil and Notes
/* Java uses call by value for all method parameters. 
 * Definition:Calling a method by passing a value in the parameter.
 * This means that when you pass a variable to a method, a copy of the variable's value is passed to the method.
 * Any changes made to the parameter within the method do not affect the original variable outside the method.
 * If we call a method by passing a value it's called callbyvalue. 
 * Java doesn't have CallByReference because java doesn't support pointers.
*/

 public class CallByValue {
	int data=50;//instance variable
	void print(int data){ //cpy of data is passed to the method (localvariable)
		data=data+100;
    //changes in local variable only it won't affect the original variable outside the method.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue obj=new CallByValue();
		System.out.println("Before Change: "+obj.data);//calling instance variable
		obj.print(500);//calling method
		System.out.println("After Change: "+obj.data);
	}
 }

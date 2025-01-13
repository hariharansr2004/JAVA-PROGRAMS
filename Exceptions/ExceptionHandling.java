package Exceptions;
//Error-> An error is mistake made by the programmer during Coding
//Bug-> Bug is an error found during Testing
//Defect-> A defect is a bug that is not caught before release
//Exception-> is a wanted or unwanted event which occurs during the execution of the program at runtime.
//Exception Handling can be done in 3 ways:1.throw 2.try-catch 3.finally
//Example:NullReference,ArrayIndexOutofBound,TypeMismatch,CodeError,Device failures
//throws-> to indicate whether a exception  may occurs or not 
//Types of Exceptions:
//	1.User Defined Exception
//	2.Built-in Exceptions->1.Checked 2.UnChecked
//Finally-> A finally blocks are used to make sure that particular process regardless of whether an exception is thrown or not and also ensuring the cleanUp code Runs.
//Note: Finally block is always executed unless there is some un-handled exception that terminates the program.
//Will finally block returns? ->No,it will not return any value.
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int[] num= {10,20,30,40,50};
		    System.out.println(num[10]);	
		}
		catch(Exception e){ //If we didn't mention any anything in catch it will blank in terminal
			System.out.println("Something Went Wrong");
		}
		finally { //To check whether try-catch is done or not
			System.out.println("Try catch Completed");
		}
	}
}

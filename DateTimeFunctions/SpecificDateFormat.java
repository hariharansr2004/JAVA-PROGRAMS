package DateTimeFunctions;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

//Question: Take Date as input from the user from a specified format and print it.
/* Steps:
 * 1.Getting User Input
 * 2.Create Object for SimpleDateFormat Class and also specify the format of the date
 * 3.Create Object for Date Class to Parse the string into date
 * 4.Printing the date using .format().
 */
public class SpecificDateFormat {
	public static void main(String[] args) {
		//Step 1:
		System.out.println("Enter your in dd/MM/yyyy: ");
		Scanner sc=new Scanner (System.in);
		String date_input=sc.next();
		System.out.println("The input type is: "+date_input.getClass().getSimpleName());
		//Step 2:
		SimpleDateFormat SDF_obj=new SimpleDateFormat("dd/MM/yyyy"); 
        //Step 3:
		try {
			Date date_obj=SDF_obj.parse(date_input); 
			System.out.println("After Parse: "+date_obj);
			System.out.println("Returning our String input as Date: "+SDF_obj.format(date_obj));
			System.out.println("The output type is: "+date_obj.getClass().getSimpleName());
			
		}
		catch(Exception e){
			System.out.println("Invalid Format"+ e);
		}
		sc.close();
	}
}
/* Explanation:
 * 	String date_input=sc.next();-> we don't know whether the user provides special characters or not so, we use next.
 *  SimpleDateFormat[under text package]->Ensures that input String is interpreted as date in specified format.
 *  MM->Month mm->Minutes
 *  parse()-> converts String into Date and returns a Date object with the value Thu Jan 01 00:00:00 IST 2025.
 *  SDF_obj.format(date_obj)->returns the Date in user specified format. (Type->Date)
 *  //If we specify 01/01/2025 instead of dd/mm/yyyy it will specify invalid format due to mismatch of date values
 */
package DateTimeFunctions;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.text.*;
public class DateandTimeTask {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Date in the Format ('dd/mm/yyyy') : ");
		String given_date = sc.next();
		
		
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		
		
//Parse" in the context of dates means to take a string representing a date (like "2023-10-25") and convert it into a structured date format that a computer can understand and work with, by identifying the individual components like year, month, and day from the string
          Date date = df.parse(given_date);
          System.out.println("The Given Date is : " + df.format(date));
         
          Calendar calendar = Calendar.getInstance();
        
          calendar.setTime(date);
          
          calendar.add(Calendar.DAY_OF_MONTH, 4);
          calendar.add(Calendar.MONTH, 4);
          calendar.add(Calendar.YEAR, 4);
       
          int day = calendar.get(Calendar.DAY_OF_MONTH);
          int month = calendar.get(Calendar.MONTH); 
          int year = calendar.get(Calendar.YEAR);
          
          System.out.printf("Date after adding 4 days, 4 months, and 4 years: %02d/%02d/%04d\n", day, month, year);
	
	}
}
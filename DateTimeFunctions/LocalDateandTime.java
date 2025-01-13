package DateTimeFunctions;
import java.time.LocalDate;
import java.time.LocalTime;
public class LocalDateandTime {
	public  static void LocalDate() {
		LocalDate a=LocalDate.now();
		LocalDate b=LocalDate.of(2025, 10, 1);
		LocalDate c=LocalDate.parse("2024-12-12"); //(format for parse():year-month-date)
		System.out.println("Local Date: "+a);
		System.out.println("Specified date by the User using LocalDate.of(): "+b);
		System.out.println("Parsed Date:" +c);
		System.out.println("The parse date type is:"+c.getClass().getSimpleName()); // to check the type of object
	}
	public static void LocalTime() {
		LocalTime a=LocalTime.now();
		LocalTime b=LocalTime.of(2, 30, 5); //format: LocalTime.of(hr,min,sec)
		LocalTime x=LocalTime.parse("12:12:22");	
		System.out.println("Current Local Time: "+a);
		System.out.println("Specified date by the User using LocalTime.of(): "+b);
		System.out.println("Parsed time: "+x);
		System.out.println("The parse time type is: "+ x.getClass().getSimpleName());
	}
	public static void disp(){  
		LocalTime c=LocalTime.MAX;
	    LocalTime d=LocalTime.MIN;
	    LocalTime e=LocalTime.MIDNIGHT;
	    LocalTime f=LocalTime.NOON;
		System.out.println("Max time:"+c);
		System.out.println("Min time:"+d);
		System.out.println("Midnight time:"+e);
		System.out.println("Noon time:"+f);
	}
	
	public static void main(String[] args) {
		LocalDateandTime.LocalDate();
		System.out.println("---------------------------------------");
		LocalDateandTime.LocalTime();
		System.out.println("---------------------------------------");
		LocalDateandTime.disp();
	}
}

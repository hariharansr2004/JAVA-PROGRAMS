package SwitchandEnums;
public class EnhancedSwitch {
	public static void main(String[] args) {
		String day = "Mon";
		String task = "Learn Java";
		String task1 = "Learn SQL";

		switch (day) {
		case "Mon" -> {
			System.out.println("It's a work day");
			switch (task) {
			case "Learn Switch" -> System.out.println("Task: Focus on Java");
			case "Review Code" -> System.out.println("Task: Review previous assignments");
			default -> System.out.println("Task: Undefined");
			}
		}
		case "Tues" -> System.out.println("It's a work day");
		case "Wed" -> System.out.println("It's a work day");
		case "Thurs" -> System.out.println("It's a work day");
		case "Fri" -> System.out.println("It's a work day");
		case "Sat" -> System.out.println("It's a workoff day");
		case "Sun" -> {
			System.out.println("It's a workoff day");
			switch (task1) {
			case "Learn Switch" -> System.out.println("Task: Focus on SQL");
			case "Review Code" -> System.out.println("Task: Review previous assignments");
			default -> System.out.println("Task: Undefined");
			}
		}
		default -> System.out.println("Invalid day");
		}
	}
}

package SwitchandEnums;
import java.util.*;
/*
public class enumtask {
		    enum course{JAVA,AI,ML}
			public static void main(String[] args) {
				Scanner s= new Scanner(System.in);
				System.out.println("Enter your course");
				String enums=s.nextLine().toUpperCase();
				switch(enums) {
				 
				 case "JAVA":
					 System.out.println("Your select java");
					 break;
				 case "AI":
					 System.out.println("Your select AI");
					 break;
				 case "ML":
					 System.out.println("Your select ML");
					break;
				 default:
					System.out.println("Your select wrong input");
				 }
			}
		}
*/
public class enumtask {
	    enum course1 { JAVA, AI, ML }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a course (JAVA, AI, ML):");
	        String a = sc.next(); 
	            course1 selectedCourse = course1.valueOf(a);
	            switch (selectedCourse) {
	                case JAVA:
	                    System.out.println("Java course");
	                    break;
	                case AI:
	                    System.out.println("AI course");
	                    break;
	                case ML:
	                    System.out.println("MI course");
	                    break;
	                default:
	                    System.out.println("Invalid course");
	            }
	    }
	}








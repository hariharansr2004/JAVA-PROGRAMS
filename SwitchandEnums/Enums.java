package SwitchandEnums;
import java.util.*;
enum course1{JAVA,AI,ML}
public class Enums {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
		        course1 []pcourse=course1.values();
				for(course1 c :pcourse) {
					switch(c) {
					case JAVA:
						System.out.println("Java course");
						break;
					case AI:
						System.out.println("AI course");	
						break;
					case ML:
						System.out.println("ML course");	
						break;
					}
				}
			}
}
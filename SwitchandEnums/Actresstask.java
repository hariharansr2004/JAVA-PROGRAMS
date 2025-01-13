package SwitchandEnums;
import java.util.*;

public class Actresstask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Favourite Actress from the below List:");
		System.out.println("1.Trisha 2.Nayan 3.Samantha");
		Scanner obj=new Scanner(System.in);
		String n=obj.nextLine();
		
		switch(n) {
		case "Nayan":
			System.out.println("Select the actors from the list");
			System.out.println("1.Vijay 2.Ajith 3.VJS");
			String movie=obj.nextLine();
			switch(movie) {
			case "Vijay":
				System.out.println("Bigil");
				break;
			case "Ajith":
				System.out.println("Viswasam");
				break;
			case "VJS":
				System.out.println("KRK");
				break;
			default:
				System.out.println("Enter Valid Hero Name");
			}break;
		case "Trisha":
			System.out.println("Select the actors from the list");
			System.out.println("1.Vijay 2.Ajith 3.VJS");
			String movie2=obj.nextLine();
			switch(movie2) {
				case "Vijay":
					System.out.println("LEO");
					break;
				case "Ajith":
					System.out.println("Mangatha");
					break;
				case "VJS":
					System.out.println("96");
					break;
				default:
					System.out.println("Enter Valid Hero Name");
				}break;
		case "Samantha":
			System.out.println("Select the actors from the list");
			System.out.println("1.Vijay 2.Surya 3.VJS");
			String movie3=obj.nextLine();
			switch(movie3) {
			case "Vijay":
				System.out.println("Theri");
				break;
			case "Ajith":
				System.out.println("Anjaan");
				break;
			case "VJS":
				System.out.println("KRK");
				break;
			default:
				System.out.println("Enter Valid Hero Name");
				break;
						
			}break;	
		default:
			System.out.println("Enter Valid Actress Name");
			
		}
		
	}
	
}



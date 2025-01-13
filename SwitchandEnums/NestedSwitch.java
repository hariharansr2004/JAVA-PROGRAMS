package SwitchandEnums;

import java.util.Scanner;

public class NestedSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Favourite Actor from the below List:");
		System.out.println("1.Vijay 2.Rajini 3.Kamal");
		Scanner obj=new Scanner(System.in);
		String n=obj.nextLine();
		switch(n) {
		case "Vijay":
			System.out.println("Select One movie from the list");
			System.out.println("1.Leo 2.Mersal 3.Beast 4.GOAT 5.Theri");
			String movie=obj.nextLine();
			switch(movie) {
			case "Leo":
				System.out.println("Blockbuster");
				break;
			case "Mersal":
				System.out.println("Blockbuster");
				break;
			case "Beast":
				System.out.println("Flop");
				break;
			case "GOAT":
				System.out.println("Hit");
				break;
			case "Theri":
				System.out.println("Blockbuster");
				break;			
			default:
				System.out.println("Enter Valid Movie Name");
			}break;
		case "Rajini":
			System.out.println("Select One movie from the list");
			System.out.println("1.Petta 2.Vettaiyan 3.Annatha 4.Jailer 5.2.0");
			String movie2=obj.nextLine();
			switch(movie2) {
			case "Petta":
				System.out.println("Blockbuster");
				break;
			case "Jailer":
				System.out.println("Blockbuster");
				break;
			case "Annatha":
				System.out.println("Flop");
				break;
			case "Vettaiyan":
				System.out.println("Hit");
				break;
			case "2.0":
				System.out.println("Blockbuster");
				break;
			default:
				System.out.println("Enter Valid Movie Name");
			}break;
		case "Kamal":
			System.out.println("Select One movie from the list");
			System.out.println("1.Vikram 2.Dhasavadaram 3.Indian 2 4.Virumaandi 5.Anbe Sivam");
			String movie3=obj.nextLine();
			switch(movie3) {
			case "Vikram":
				System.out.println("Blockbuster");
				break;
			case "Dhasavadaram":
				System.out.println("Blockbuster");
				break;
			case "Indian 2":
				System.out.println("Flop");
				break;
			case "Anbe Sivam":
				System.out.println("Hit");
				break;
			case "Virumaandi":
				System.out.println("Blockbuster");
				break;		
			default:
				System.out.println("Enter Valid Movie Name");
			}break;
		default:
			System.out.println("Enter Valid Actor Name");
			
			
		}
		
	}

}

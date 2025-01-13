package Arrays;
import java.util.*;
public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }


	}

}

  

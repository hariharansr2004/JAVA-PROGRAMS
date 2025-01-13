package Arrays;
import java.util.*;
/*
 *Jagged array-> Array within an array keeping row constant, but columns are different. 
 * a value is the data that is storing in our variable. variable is a name for specific data-type.
 * 
 */
public class JaggedArrays {
	
    public static void main(String[] args) {
        // Creating a jagged array with 3 rows
        int[][] jag = new int[3][];
        
        // Initializing the jagged array with arrays of different sizes
        jag[0] = new int[] {1, 2, 3};
        jag[1] = new int[] {4, 5};
        jag[2] = new int[] {6, 7, 8, 9};
        
        // Iterating through the jagged array
        System.out.println("Contents of the jagged array:");
        for (int i = 0; i < jag.length; i++) {
        	//j based on i
            for (int j = 0; j < jag[i].length; j++) {
                System.out.print(jag[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}


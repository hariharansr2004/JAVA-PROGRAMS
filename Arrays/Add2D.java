package Arrays;
import java.util.Arrays;
public class Add2D {
	
	public static void add(int arr1[][],int arr2[][]){
		int[][]arr3=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(Arrays.deepToString(arr3));
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]arr2= {{1,2,3},{4,5,6},{7,8,9}};
	
		Add2D.add(arr1, arr2);

	}

}

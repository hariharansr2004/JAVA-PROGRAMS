package Arrays;
/*There are 4 general rules for solving a pattern-based question: 

We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.
Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
We print the ‘*’ inside the inner loop.
Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns.*/
public class Patterns {
	static void pattern1(int n) {
		for (int i=1;i<=n;i++){ 
			for(int j=1;j<=n;j++){
				System.out.print("*");
			} 
			System.out.println();
		}
	}
	
	static void pattern2(int n){
	        for(int i=1;i<=n;i++){
	             for(int j=1;j<=n;j++){
	                 System.out.print(i);
	             }
	           System.out.println(); 
	        }    
	    }
	
	static void pattern3(int n) {
		for (int i=1;i<=n;i++){ 
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			} 
			System.out.println();
		}

	}
	static void pattern4(int n) {
		for (int i=1;i<=n;i++){ 
			for(int j=1;j<=i;j++){
				System.out.print(j);
			} 
			System.out.println();
		}

	}
	static void pattern5(int n){
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(i);
             }
           System.out.println(); 
        }    
    }
	static void pattern6(int n){
        int p=1;
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p++ );
            }
          System.out.println(); 
       }    
   }
	static void pattern7(int n) {
		for (int i=1;i<=n;i++){ // 1<=5
			for(int j=1;j<=n-i+1;j++){ //<=5-1
				System.out.print("* ");
			} 
			System.out.println();
		}

	}
	static void pattern8(int n) {
		for (int i=1;i<=n;i++){ 
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			} 
			System.out.println();
		}

	}
	
    public static void pattern9(int n) {
    for (int i = 1; i <=n; i++) {
       for (int k = 1; k <=n-i;k++) {
           System.out.print(" ");
       }
       for (int j = 1; j <= 2 * i -1; j++) {
           System.out.print("*");
       }
       System.out.println();
   }
 }
    
    public static void pattern10(int n) {
        for (int i = 1; i <=n; i++) {
           for (int k = 1; k <=i- 1;k++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= 2 * (n - i) +1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
    public static void pattern11(int n) {
        for (int i=1;i<=2*n;i++) {
           int a=(i>5)?2*n-i:i;
           for (int j = 1; j<=a; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns.pattern1(5);
		System.out.println("----------------------------");
		Patterns.pattern2(5);
		System.out.println("----------------------------");
		Patterns.pattern3(5);
		System.out.println("----------------------------");
		Patterns.pattern4(5);
		System.out.println("----------------------------");
		Patterns.pattern5(5);
		System.out.println("----------------------------");
		Patterns.pattern6(5);
		System.out.println("----------------------------");
		Patterns.pattern7(5);
		System.out.println("----------------------------");
		Patterns.pattern8(5);
		System.out.println("----------------------------");
		Patterns.pattern9(5);
		System.out.println("----------------------------");
		Patterns.pattern10(5);
		System.out.println("----------------------------");
		Patterns.pattern11(5);
		System.out.println("----------------------------");

	}

}

/*
 What is the output of the following code snippet?
3: int x1 = 50, x2 = 75;
4: boolean b = x1 >= x2;
5: if(b = true) System.out.println("Success");
6: else System.out.println("Failure");
			A. Success
B. Failure
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
 */
public class Question13 {

	public static void main(String[] args) {
		
		int x1 = 50, x2 = 75;
		 boolean b = x1 >= x2;
		 if(b = true) System.out.println("Success");
		 else System.out.println("Failure");
		
	}

}

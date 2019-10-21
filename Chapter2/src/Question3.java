/*
 What is the output of the following application?
1: public class CompareValues {
2: public static void main(String[] args) {
3: int x = 0;
4: while(x++ < 10) {}
5: String message = x > 10 ? "Greater than" : false;
6: System.out.println(message+","+x);
7: }
8: }
Greater than,10
B. false,10
C. Greater than,11
D. false,11
E. The code will not compile because of line 4.
F. The code will not compile because of line 5.

 */
public class Question3 {
	 
		  public static void main(String[] args) {
		  int x = 0;
		  while(x++ < 10) {}
		  String message = x > 10 ? "Greater than" : false;
		  System.out.println(message+","+x);
		  }
		  }


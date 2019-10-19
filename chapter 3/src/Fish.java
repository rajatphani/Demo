/*1. What is output by the following code? (Choose all that apply)
 public class Fish {
 public static void main(String[] args) {
 int numFish = 4;
 String fishType = "tuna";
 String anotherFish = numFish + 1;
 System.out.println(anotherFish + " " + fishType);
 System.out.println(numFish + " " + 1);
 	} }
A. 4 1
B. 41
C. 5
D. 5 tuna
E. 5tuna
F. 51tuna
G. The code does not compile.*/

public class Fish {
	public static void main(String[] args) 
	{
		int numFish = 4;
		 String fishType = "tuna";
		 /*String anotherFish = numFish+1;
		 System.out.println(anotherFish + " " + fishType);*/
		 System.out.println(numFish + " " + 1);
	}

}
/*output: G.The code does not compile.(Type mismatch:cannot convert from int to string)*/
/*2. Which of the following are output by this code? (Choose all that apply)
 String s = "Hello";
 String t = new String(s);
 if ("Hello".equals(s)) System.out.println("one");
 if (t == s) System.out.println("two");
 if (t.equals(s)) System.out.println("three");
 if ("Hello" == s) System.out.println("four");
 if ("Hello" == t) System.out.println("five");
A. one
B. two
C. three
D. four
E. five
F. The code does not compile.*/
public class second {

	public static void main(String[] args) 
	{
		 String s = "Hello";
		 String t = new String(s);
		 if ("Hello".equals(s)) 
			 System.out.println("one");
		 if (t == s) 
			 System.out.println("two");
		 if (t.equals(s))
			 System.out.println("three");
		 if ("Hello" == s) 
			 System.out.println("four");
		 if ("Hello" == t) 
			 System.out.println("five");

	}

}
/*output:A.one
 		 C.three
 		 D.four */

/*What is the result of the following code?
 String s = "purr";
 s.toUpperCase();
 s.trim();
 s.substring(1, 3);
 s += " two";
 System.out.println(s.length());
A. 2
B. 4
C. 8
D. 10
E. An exception is thrown.
F. The code does not compile.*/
public class nineth 
{
	public static void main(String[] args) 
	{
		 String s = "purr";
		 s.toUpperCase();
		 s.trim();
		 s.substring(1, 3);
		 s += " two";
		 System.out.println(s.length());	

	}
}
/*output:C.8 */
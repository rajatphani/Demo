/*Which are the results of the following code? (Choose all that apply)
String letters = "abcdef";
System.out.println(letters.length());
System.out.println(letters.charAt(3));
System.out.println(letters.charAt(6));
A. 5
B. 6
C. c
D. d
E. An exception is thrown.
F. The code does not compile.*/
public class seventh 
{
	public static void main(String[] args) 
	{
		String letters = "abcdef";
		System.out.println(letters.length());
		System.out.println(letters.charAt(3));
		System.out.println(letters.charAt(6));

	}

}
/*output:B.6
 		 D.d
 		 E.An exception is thrown( java.lang.StringIndexOutOfBoundsException: String index out of range: 6)*/


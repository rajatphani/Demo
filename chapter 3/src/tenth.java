/*What is the result of the following code? (Choose all that apply)
 String a = "";
 a += 2;
 a += 'c';
 a += false;
 if ( a == "2cfalse") System.out.println("==");
 if ( a.equals("2cfalse")) System.out.println("equals");
A. Compile error on line 14.
B. Compile error on line 15.
C. Compile error on line 16.
D. Compile error on another line.
E. ==
F. equals
G. An exception is thrown.*/
public class tenth 
{
	public static void main(String[] args) 
	{
		 String a = "";
		 a += 2;
		 a += 'c';
		 a += false;
		 if ( a == "2cfalse") 
			 System.out.println("==");
		 if ( a.equals("2cfalse"))
			 System.out.println("equals");
	}
}
/*output:F.equals*/
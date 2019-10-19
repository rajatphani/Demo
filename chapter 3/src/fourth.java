/*What is the result of the following code?
 StringBuilder sb = new StringBuilder();
 sb.append("aaa").insert(1, "bb").insert(4, "ccc");
 System.out.println(sb);
A. abbaaccc
B. abbaccca
C. bbaaaccc
D. bbaaccca
E. An exception is thrown.
F. The code does not compile.*/
public class fourth 
{
	public static void main(String[] args) 
	{
		 StringBuilder sb = new StringBuilder();
		 sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		 System.out.println(sb);

	}

}
/*output:B.abbaccca*/

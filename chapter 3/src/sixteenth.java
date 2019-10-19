/*Which of these compile when replacing line 8? (Choose all that apply)
7: char[]c = new char[2];
8: // INSERT CODE HERE
A. int length = c.capacity;
B. int length = c.capacity();
C. int length = c.length;
D. int length = c.length();
E. int length = c.size;
F. int length = c.size();
G. None of the above.*/
public class sixteenth 
{
	public static void main(String[] args)
	{
		char[]c = new char[2];
		int length = c.length;
		System.out.println(length);
	}
}
/*output:C.int length=c.length;*/

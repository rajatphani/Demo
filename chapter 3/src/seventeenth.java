import java.util.ArrayList;

/*Which of these compile when replacing line 8? (Choose all that apply)
7: ArrayList l = new ArrayList();
8: // INSERT CODE HERE
A. int length = l.capacity;
B. int length = l.capacity();
C. int length = l.length;
D. int length = l.length();
E. int length = l.size;
F. int length = l.size();
G. None of the above.*/
public class seventeenth 
{
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		int length=l.size();
	}
}
/*output:E.int length=l.size();*/
import java.util.ArrayList;
import java.util.List;

/*What is the result of the following?
List<String> one = new ArrayList<String>();
one.add("abc");
List<String> two = new ArrayList<>();
two.add("abc");
if (one == two)
System.out.println("A");
else if (one.equals(two))
System.out.println("B");
else
System.out.println("C");
A. A
B. B
C. C
D. An exception is thrown.
E. The code does not compile.*/
public class twentyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
		System.out.println("A");
		else if (one.equals(two))
		System.out.println("B");
		else
		System.out.println("C");

	}

}
/*output:B */
import java.util.ArrayList;

/*What is the result of the following statements?
 ArrayList<Integer> values = new ArrayList<>();
 values.add(4);
 values.add(5);
 values.set(1, 6);
 values.remove(0);
 for (Integer v : values)
 System.out.print(v);
A. 4
B. 5
C. 6
D. 46
E. 45
F. An exception is thrown.
G. The code does not compile.*/
public class twentyone 
{
	public static void main(String[] args) 
	{
		 ArrayList<Integer> values = new ArrayList<>();
		 values.add(4);
		 values.add(5);
		 values.set(1, 6);
		 values.remove(0);
		 for (Integer v : values)
		 System.out.print(v);	
	 }
}
/*output:C */
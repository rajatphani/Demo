import java.util.ArrayList;
import java.util.List;

/*What is the result of the following statements?
6:List<String> list = new ArrayList<String>();
7: list.add("one");
8: list.add("two");
9: list.add(7);
10:for(String s : list) System.out.print(s);
A. onetwo
B. onetwo7
C. onetwo followed by an exception
D. Compiler error on line 9.
E. Compiler error on line 10.*/
public class twenty
{
	public static void main(String[] args)
	{
		 List<String> list = new ArrayList<String>();
		 list.add("one");
		 list.add("two");
		 /*list.add(7);*/
		 for(String s : list) 
			 System.out.print(s);
	}
}
/*output:D */

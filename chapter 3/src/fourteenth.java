/*Which of the following can be replaced to print "avaJ"? (Choose all that apply)
 StringBuilder puzzle = new StringBuilder("Java");
 System.out.println(puzzle);
A. puzzle.reverse();
B. puzzle.append("vaJ$").substring(0, 4);
C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
E. None of the above.*/
public class fourteenth 
{
	public static void main(String[] args) 
	{
		StringBuilder puzzle = new StringBuilder("Java");
		puzzle.reverse();
		System.out.println(puzzle);	
	}
}
/*output:A.puzzle.reverse();*/

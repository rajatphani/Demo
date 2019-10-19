/*What is the result of the following code?
public class Lion {
public void roar(String roar1, StringBuilder roar2) {
roar1.concat("!!!");
roar2.append("!!!");
}
public static void main(String[] args) {
String roar1 = "roar";
StringBuilder roar2 = new StringBuilder("roar");
new Lion().roar(roar1, roar2);
Review Questions 155
System.out.println(roar1 + " " + roar2);
} }
A. roar roar
B. roar roar!!!
C. roar!!! roar
D. roar!!! roar!!!
E. An exception is thrown.
F. The code does not compile.*/
public class Lion 
{
	public void roar(String roar1, StringBuilder roar2) 
	{
		roar1.concat("!!!");
		roar2.append("!!!");
	}
	public static void main(String[] args) 
	{
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2);
	} 

}
/*output:B */



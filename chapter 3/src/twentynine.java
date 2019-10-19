import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*What is the output of the following code?
LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_
DATE);
date.plusDays(2);
date.plusHours(3);
System.out.println(date.getYear() + " " + date.getMonth() + " "
+ date.getDayOfMonth());
A. 2018 APRIL 2
B. 2018 APRIL 30
C. 2018 MAY 2
D. The code does not compile.
E. A runtime exception is thrown.*/
public class twentynine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
	    date.plusYears(3);
	    /*date.plusHours(3);*/
		System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());

	}

}
/*output:D */

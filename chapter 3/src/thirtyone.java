import java.time.LocalDate;
import java.time.Month;

/*What is the output of the following code?
LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth() + " "
+ date.getDayOfMonth());
A. 2018 APRIL 2
B. 2018 APRIL 30
C. 2018 MAY 2
D. 2021 APRIL 2
E. 2021 APRIL 30
F. 2021 MAY 2
G. A runtime exception is thrown.*/
public class thirtyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());

	}

}
/*output:B */
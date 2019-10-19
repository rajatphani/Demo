import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*What is the output of the following code?
LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.ofDays(1).ofYears(2);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
.SHORT);
System.out.println(f.format(d));
A. 5/9/13 11:22 AM
B. 5/10/13 11:22 AM
C. 5/9/14
D. 5/10/14
E. The code does not compile.
F. A runtime exception is thrown.*/
public class thirtythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period.ofDays(1);
		Period p = Period.ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
		.SHORT);
		System.out.println(f.format(d));

	}

}
/*output:B */
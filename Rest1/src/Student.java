import java.io.Serializable;

public class Student implements Serializable{
	
	String name;
	double roll_no;
	String email_id;
	double phone_no;
	String surname;
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", email_id=" + email_id + ", phone_no=" + phone_no
				+ "]";
	}

	
	

}

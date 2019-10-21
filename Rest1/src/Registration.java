import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) throws IOException {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name :");
		s.name = sc.next();
		System.out.println("please enter your email :");
		s.email_id = sc.next();
		System.out.println("please enter your phone :");
		s.phone_no = sc.nextDouble();
		System.out.println(s.toString());  // Stdent@812394782983
		
		
		// Serilization 
		File f = new File("E:\\Student info\\students.data");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		fos.close();
		oos.close();
			
			
			
			
			
		
		
		
		
	}

}

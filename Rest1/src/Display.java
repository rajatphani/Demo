import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Display {

	public static void main(String...args) throws IOException, ClassNotFoundException
	{
		Student s ;
		
				File f = new File("E:\\Student info\\students.data");
				FileInputStream fos = new FileInputStream(f);
				ObjectInputStream oos = new ObjectInputStream(fos);
				
				s = (Student)oos.readObject();
				
				System.out.println(s);
				fos.close();
				oos.close();
					
					
		
		
	}
}

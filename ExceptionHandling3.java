package javaassignment;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream  fis=null;
		try {
			fis =new FileInputStream("d:/abc.txt");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("file not found..");
			
		}

		 finally {
			if(fis!=null)
			{
				
	          //  fis.close();
				
			}
			System.out.println("file close");
			 
		}
	}

}

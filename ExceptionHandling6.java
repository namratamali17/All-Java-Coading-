package javaassignment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 class ReadAndWrite
{

	void readFile() throws FileNotFoundException
	{
		
		FileInputStream fiS =new FileInputStream("d:/abnc.txt");
		
	}
     void saveFile() throws FileNotFoundException
     {
    	 String text="hello new demo";
    	 FileOutputStream fiO =new FileOutputStream("d:/xyzab.txt");
    	 
    	 
     }
	
	
	
	}
class ExceptionHandling6
{
	 public  static void main(String[] args) 
	 {
		 
		 ReadAndWrite rw =new ReadAndWrite();
		 try {
			 rw.readFile();
			// rw.saveFile();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		 System.out.println("hii");
			
	}
	
	
	}



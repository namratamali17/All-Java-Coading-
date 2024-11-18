package javaassignment;
import java.net.*;
import java.io.*;
import java.util.*;

public class SocketProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Socket client =new Socket("localhost",4500);
			InputStream input =client.getInputStream();
			BufferedReader datastraem =new BufferedReader(new InputStreamReader(input));
			String strTime=datastraem.readLine();
			System.out.println(" current time of server "+strTime);
			input.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
	}

	
	}



package javaassignment;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionVectorEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector v =new Vector<>();
		v.add(4000);
		v.add("namu");
		v.add(8882);
		v.add(5888);
		Enumeration e =v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
		

	}

}

package javaassignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList a =new ArrayList();
       a.add(1000);
       a.add(455);
       a.add(45555);
		//System.out.println(a);
		
       Iterator itr=a.iterator();
       {
    	  while(itr.hasNext())
    	  {
    		  
    		  System.out.println(itr.next());
    	  }
	}
	} 

}

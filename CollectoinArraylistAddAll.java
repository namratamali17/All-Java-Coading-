package javaassignment;

import java.util.ArrayList;

public class CollectoinArraylistAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		 ArrayList a =new ArrayList();
		 a.add(100);
		 a.add(200);
		 a.add(300);
		 
		 ArrayList a2=new ArrayList();
		 a2.add("aaaa");
		 a2.add("bbbb");
		 a2.add("ccc");
		 a.addAll(a2);
		 System.out.println(a);
		 
	     a.remove(1);
	     System.out.println(a);
	}

}

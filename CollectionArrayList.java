package javaassignment;

import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList a =new ArrayList();
         a.add(12);
         a.add("namu");
         a.add(7888);
         a.add("mona"); 
         System.out.println(a);
         
         ArrayList a2=new ArrayList();
         a2.add(120);
         a2.add(788);
         a2.add(422);
         System.out.println(a2);
         
         a.addAll(a2);
         System.out.println(a);
	}

}

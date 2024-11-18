package javaassignment;

import java.util.ArrayList;
import java.util.List;

public class CollectionArraysListCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> a =new ArrayList<>();
		 a.add(" namu");
		 a.add(" ranu");
		 a.add("sonu");
		 System.out.println(a);
		 List<String> copy=new ArrayList<>(a);
		 System.out.println(copy);
		 
		
		
		
	}

}

package javaassignment;

import java.util.ArrayList;
import java.util.Collections;

import javax.naming.ldap.SortControl;

public class CollectionArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a =new ArrayList<>();
		a.add(301);
		a.add(77);
		a.add(784);
		a.add(7966);
		a.add(36);
		a.add(12);
		a.add(55);
		System.out.println("Befor Sort" +a);
		Collections.sort(a);
		System.out.println("after sort " +a);
		
		
		

	}

}

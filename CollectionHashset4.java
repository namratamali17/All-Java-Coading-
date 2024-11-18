package javaassignment;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashset4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> a =new HashSet<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(6);
		a.add(7);
		a.add(8);
		a.remove(1);
		System.out.println(a);
		Set<Integer> e =new HashSet<>();
		e.add(2);
		e.add(4);
		e.add(6);
		a.removeAll(e);
		System.out.println(a);
		
		
		
		

	}

}

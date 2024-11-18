package javaassignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collectionhashset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> a =new HashSet<>();
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(10);
		Set<Integer> ten=new HashSet<>(a);
		List<Integer> next =new ArrayList<>();
		next.add(12);
		next.add(14);
		next.add(16);
		next.add(18);
		next.add(20);
		next.addAll(a);
		System.out.println(a);
		
		
		
		

	}

}

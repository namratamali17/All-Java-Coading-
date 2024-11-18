package javaassignment;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> a =new TreeSet<>();
		a.add(6);
		a.add(44);
		a.add(67);
		a.add(2);
		a.add(5);
		System.out.println(a);
		Iterator<Integer> k =a.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
		{
			
		}

	}

}

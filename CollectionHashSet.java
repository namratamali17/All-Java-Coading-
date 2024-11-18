package javaassignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet t = new HashSet();
		t.add(1000);
		t.add(5200); 
		t.add(5551);
		t.add(4777);
		t.add(1000);
		//System.out.println(t);
		
		Iterator it =t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

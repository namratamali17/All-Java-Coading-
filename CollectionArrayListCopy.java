package javaassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayListCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> t =new ArrayList<String>();
		t.add(" one ");
		t.add(" Two");
		t.add(" Three");
		t.add(" four");
		t.add(" five");
		Iterator<String> iterator=t.iterator();
		while (iterator.hasNext()) {
			String type =  iterator.next();
			System.out.println(type);
			if(type.equals("one")) {
				t.remove(" one");
			}
		}
		
		System.out.println(t);
	}

}

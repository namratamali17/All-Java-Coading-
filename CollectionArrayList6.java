package javaassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a =new ArrayList<>();
		a.add(" c");
		a.add(" jva");
		a.add(" .net");
		a.add(" python");
        ListIterator<String> listIterator =a.listIterator();
        System.out.println(" forward direction list...");
        while (listIterator.hasNext()) {
			String t  =  listIterator.next();
			System.out.println(t);
			
			
			
			
			}
         System.out.println("Backward direction list ..");
        while (listIterator.hasPrevious()) {
			String type =  listIterator.previous();
			System.out.println(type);
			
		}

	}

}

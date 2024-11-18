package javaassignment;

import java.util.LinkedList;

public class CollectionLinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> friuit=new LinkedList<>();
		friuit.add(" apple");
		friuit.add(" pineapple");
		friuit.add(" mango");
		String first =friuit.getFirst();
		System.out.println(" first element "+first);
		String lastt1 =friuit.getLast();
		System.out.println(" Last element" +lastt1 );
        for (String fris : friuit) {
			System.out.println(friuit);
		}
        	
		
		
	}

}

package javaassignment;

import java.util.LinkedList;

public class CollectionLinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> friuit=new LinkedList<>();
		friuit.add(" apple");
		friuit.add(" pineapple");
		friuit.add(" mango");
		friuit.add("orange");
		System.out.println("list is :"+friuit);
		String ele =friuit.removeFirst();
		System.out.println(friuit );
		String ele1 =friuit.removeLast();
		System.out.println(friuit);
		
		

	}

}

package javaassignment;

import java.util.LinkedList;

public class CollectionLInkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> friuit=new LinkedList<>();
		friuit.add(" apple");
		friuit.add(" pineapple");
		friuit.add(" mango");
		System.out.println("initial linked list.."+friuit);
		friuit.add(2, " waltemelon");
		System.out.println("After adding "+friuit);
		friuit.addFirst("Stowberrye ");
		System.out.println("Fiest element add i link list"+friuit);
		friuit.addLast(" orange");
        System.out.println("Afterb lat elemnent add in linked list"+friuit);		

	}

}

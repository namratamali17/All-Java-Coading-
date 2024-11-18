package javaassignment;

import java.util.LinkedList;
import java.util.List;

public class CollectionLikedList {
	public static void main(String[] args)
	{
		List<String> p =new LinkedList<String>();
		p.add(" java");
		p.add(" c+++");
		p.add(" Spring");
		p.add(" androide");
		boolean result=p.contains("java ");
		System.out.println(result);
		int index=p.indexOf(2);
		System.out.println(index);
		int  lastindex =p.lastIndexOf(" androide ");
		System.out.println(lastindex); 
		
		
	}

}

package javaassignment;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionArraysListIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a = Arrays.asList(" c"," c++", " java"," spring ");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		
		
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			String a1 = (String) iterator.next();
			System.out.println(a1);
		}
		
		//lambda example
	//	a.stream().forEach(a) -> System.out.println(a));
		
		

	}

}

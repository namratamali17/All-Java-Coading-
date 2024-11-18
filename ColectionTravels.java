package javaassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ColectionTravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList< String> n =new ArrayList<>();
		n.add("rani");
		n.add("tina");
		n.add("ajay");
		n.add("namrata mali");
		for (String str : n) {
			
		System.out.println(str+"\t"+str.length()+"\t");	
		StringBuffer b =new StringBuffer(str);
		System.out.println(b.reverse());
		
		Iterator<String> it =n.iterator();
		while (it.hasNext()) {
			String next =it.next();
			System.out.println(next);
			
		}
		
		System.out.println(" for each methad.. .. using lambada expression");
		
	/*	n.forEach(str->{
			System.out.println(str);
		});
		
	*/	
		}
		
		
		
		
	}

}

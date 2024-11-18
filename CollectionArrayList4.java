package javaassignment;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> toprograming =new ArrayList<String>();
		 System.out.println("programing language is empty"+toprograming.isEmpty());
		 toprograming.add("c");
		 toprograming.add(" c++");
		 toprograming.add(" java");
		 System.out.println(" to pro lang "+toprograming.size());
		 String bestLang =toprograming.get(2);
		 System.out.println(" best Language "+bestLang);
		 

	}

}

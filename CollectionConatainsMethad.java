package javaassignment;

import java.util.ArrayList;
import java.util.List;

public class CollectionConatainsMethad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List  a =new ArrayList<>();
        a.add(102);
        a.add(780);
        a.add(455);
        a.add(888);
        System.out.println(a);
        if (a.contains(102)) {
        	System.out.println("element found");
			
		}
		
        else {
        	System.out.println("element not found");
        }
		
	}

}

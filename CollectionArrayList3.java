package javaassignment;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> FirstPrime =new ArrayList<Integer>();
     FirstPrime.add(2);
     FirstPrime.add(3);
     FirstPrime.add(5);
     FirstPrime.add(7);
     List< Integer> FirstenPrime =new ArrayList<>();
     List< Integer> nextNo =new ArrayList<>();
     nextNo.add(11);
     nextNo.add(13);
     nextNo.add(17);
     nextNo.add(19);
     FirstenPrime.addAll(nextNo);
     System.out.println(FirstenPrime);
     
     
		
		
		
	}

}

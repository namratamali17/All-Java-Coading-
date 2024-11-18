package javaassignment;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDublicate_UsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,56,2,3,5,6,4,7,8,4};
		System.out.println(" Dublicate element....");
		Map<Integer, Integer> hm =new HashMap<>();
		for(int no:a)
		{
			Integer count=hm.get(no);
			if (count==null)
			{
				hm.put(no,1);
			}
			
			else {
				count=count+1;
				hm.put(no, count);
			}
			
			
			
		}
		
		Set <Map.Entry<Integer, Integer>> es =hm.entrySet();
		for(Map.Entry<Integer,Integer> me:es)
			
		{
			if(me.getValue()>1)
			{
				System.out.print("  "+me.getKey());
			}
			
			
		}
		
		

	}

}

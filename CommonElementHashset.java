package javaassignment;
import java.util.HashSet;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
public class CommonElementHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,8,4,6,2,74,12,13};
        int[] b= {12,51,55,41,8,4,66,13,7};
        
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < a.length; i++)
        {
        	for (int j = 0; j < b.length; j++)
        	{
			     if(a[i]==b[j])
			     {
			       hs.add(a[i]);
			     }
				
			}
			
		}
		
		for(int no:hs)
		{
			System.out.print(no+" ");
		}
		

	}

}

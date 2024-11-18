package javaassignment;

import java.awt.color.ICC_Profile;
import java.util.ArrayList;

public class CommoInThreeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,4,6,8,10,12,14,15};
		int[] a2= {2,5,4,6,44,77,665,444};
		int[] a3= {1,5,2,44,10,69,99,441};
		
		int x=0,y=0,z=0;
		ArrayList<Integer> al =new ArrayList();
		while(x<a.length && y<a2.length && z<a3.length)
		{
              if(a[x]==a2[y ]&& a2[y]==a3[z])
              {
            	  
            	  al.add(a[x]);
            	  x++;
            	  y++;
            	  z++;
            	  
              }
              else if (a[x]<a[y])
              {
				x++;
				
			}
              else if (a2[y]<a3[z])
              {
				y++;
			}
              
              else {
				z++;
				
			}	
			
		}
		
		for(int no:al)
		{
			System.out.println(no);
		}
		
		
		
		
		
		
		
		

	}

}

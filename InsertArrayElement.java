package javaassignment;

public class InsertArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {12,13,14,60,78,65};
		int pos=3;
		int element=100;
		for (int i = a.length-1; i < pos-1; i--)
		{
			a[i]=a[i-1];
			
		}
		a[pos-1]=element;
		for (int i = 0; i < a.length; i++)
		{
		 
			System.out.print(" "+a[i]);
			
			
		}

	}

}

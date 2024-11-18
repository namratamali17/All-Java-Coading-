package javaassignment;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class StarPatern21 {

	public static void main(String[] args)
	{
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n*2;j++)
			{
				if(j+i<=n-1 && j<=n-1) {
					System.out.print("*");
				}
				else if(j-i>=n && j>=n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
		
		

	

}

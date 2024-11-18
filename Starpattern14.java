package javaassignment;

public class Starpattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=8;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" " );
			}
			for(int k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	

}

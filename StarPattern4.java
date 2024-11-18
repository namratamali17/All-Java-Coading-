package javaassignment;

public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) {
				if(j+i>=4) {
			  System.out.print("*");
				}
				else {
					System.out.print("");
				}
				System.out.println("");
			}
		}
		
		
	}

}

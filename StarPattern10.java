package javaassignment;

public class StarPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=0;i<9;i++)
       {
    	   for (int j = 0; j <=4; j++) {
			if(j+i>=4 && j-i<=0) {
				System.out.print("*");
			}
			else
			{
				System.out.print("");
			}
		}
    	   System.out.println();
       } 
		
		
		
	}

}

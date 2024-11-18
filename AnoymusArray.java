package javaassignment;

public class AnoymusArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnoymusArray.sum(new int[]{10,20,30});
		
		
	}
	static void sum(int[] no)
	{
		int total=0;
		for(int i:no)
		{
			total=total+i;
		}
		
		System.out.println("sum is ="+total);
	}

}

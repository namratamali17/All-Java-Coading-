package javaassignment;

public class MethadOverrriding {
	
	void show(int h) {
		
		System.out.println("\n parent class methad.......");
		
	}
}
	 class xyz extends MethadOverrriding
	{
		void show(int h) 
		{
			System.out.println(" child class methad......");
		}
	
	public static void main(String[] args)
	{
		
		xyz a =new xyz();
		a.show(15);
		
	}
	
	

}

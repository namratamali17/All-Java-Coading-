package javaassignment;

class vahicle
{
  void run()
  {
	  System.out.println("bike run ");
	  
  }
}

 class MethodOverridding extends  vahicle{
	 
void run()
{
   System.out.println("runn  safely...");
	
}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethadOverrriding a =new MethadOverrriding();
		vahicle a =new vahicle();
		a.run();
		
    
		  
	}

}

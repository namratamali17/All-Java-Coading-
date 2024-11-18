package javaassignment;

  abstract class AbsrtactClass {

	
	abstract void start();
	{
		
		
	}
  }
  class car extends AbsrtactClass
  {
	  
	  void start() {
		  System.out.println(" car start with the key...");
		  
	  }
	  
  }
  class scooter extends AbsrtactClass
  {
	  
	  void start()
	  {
		  System.out.println(" scooter start ");
	  }
  
  
  public static void main(String[] args)
  {
	  scooter s=new scooter();
	  s.start();
	  
	  
  }
  
}
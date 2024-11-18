package javaassignment;

public class Animal1 {

	void eat()
	{
		System.out.println(" Eating process .........");
	}
	
	
}
 class dog extends Animal1
{
  
	/*void run()
	{
		System.out.println(" running....");
		
	}
	
	*/
public static void main(String[] args)
{
	
   dog a= new dog();
   a.eat();
  // a.run();
   }
	

}

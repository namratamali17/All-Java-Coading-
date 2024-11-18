package javaassignment;

import javax.sound.midi.VoiceStatus;

 class A11{

	void m1 ()
	{
		System.out.println(" \n Super class methad is......");
		
		
		
	}
	
}
class SuperDemo1 extends A11
{
   void show()
   {
	   
	   super.m1();
	   
	   
   }
 public static void main(String[] agrs)
 {
	SuperDemo1 a =new SuperDemo1();
	a.show();
	 
 }


}

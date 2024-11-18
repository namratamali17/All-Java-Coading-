package javaassignment;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] a= {10,5,8,77,9,44,65,12,36,84};
     int k=4;
     for (int i = 0; i < a.length; i++)
     {
    	 
    	for(int j=i+1;j<a.length;j++)
    	{
    		if(a[i]<a[j])
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    			
    			
    		}	
    		
    		
    	}
		
    	if(i==k-1)
    	{
    		System.out.println(k+"lagerst element is ..."+a[i]);
    	}
    	
	}
		
		
	}

}

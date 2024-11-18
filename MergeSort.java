package javaassignment;

public class MergeSort {
	
	int[] array;
	int[] tempMergeArr;
	int lenghth;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputArr= {48,36,52,19,94,21};
		MergeSort ms=new MergeSort();
		ms.sort(inputArr);
		
	      for(int i:inputArr)
	      {
	    	  System.out.print(i+"  ");
	      }
		
	}
	
	public void sort(int inputArr[])
	{
		this.array=inputArr;
		this.lenghth=inputArr.length;
		this.tempMergeArr=new int [lenghth];
		divideArray(0,lenghth-1);	
		
	
	}
	public void divideArray(int lowerindex,int higherindex)
	{
		if(lowerindex<higherindex)
		{
			
			int middle=lowerindex+(higherindex-lowerindex)/2;
			divideArray(lowerindex, middle);
			divideArray(middle+1, higherindex);
			
	      	mergeArray(lowerindex,middle,higherindex);
			
			
		}
	}
	
	public void mergeArray(int lowerndex,int middle,int higherindex)
	{
		
		for(int i=lowerndex;i<=higherindex;i++)
		{
			tempMergeArr[i]=array[i];
			
		}
		int i=lowerndex;
		int j=middle+1;
		int k=lowerndex;
		while(i<middle&&j<higherindex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				
				array[k]=tempMergeArr[i];
				
			      i++;
	     	}
			
			else
			{
				array[k]=tempMergeArr[i];
				j++;
			}
			k++;
			
			
		}
		while (i<=middle) {
			array[k]=tempMergeArr[i];
			k++;
			i++;
			
		}
		
		
		
		
		
	}
	
	

}

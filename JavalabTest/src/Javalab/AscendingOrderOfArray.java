package Javalab;

public class AscendingOrderOfArray {
	
	public static void main(String[] args) {
		
		int a[] = new int [] {3,5,2,1,7};
		int temp = 0;
		
		System.out.println("Elements of an array");
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]);
		}
        
		System.out.println();

		for(int i= 0 ; i<a.length ; i++)
		{
			for(int j = i+1 ; j<a.length ; j++)
			{
			   if (a[i]> a[j])
			   {
				   temp = a[i];
				   a[i] = a[j];
				   a[j] = temp;
				   
			   }
			}
		}
		
		 System.out.println();    
          
	     System.out.println("Elements of array sorted in ascending order: ");    
	      for (int i = 0; i < a.length; i++) 
	      {     
	            System.out.print(a[i] + " ");    				   
	       }    
	}
}
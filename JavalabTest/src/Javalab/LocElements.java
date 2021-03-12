package Javalab;

public class LocElements {
	 public static int  findIndex (int[] my_array, int t) 
	 {
	        if (my_array == null)return -1;
	        int len = my_array.length;
	        int i = 0;
	        while (i < len) 
	        {
	            if (my_array[i] == t)
	            {
	            	return i;
	            }
	            	
	            else
	            {
	            	i=i+1;
	            }
	        }
	        
	        return -1;
	        
	 }
	 
	public static void main(String[] args)
	{
		int a[] = {100,200,300,400,500};
	
		 System.out.println("Index position of 25 is: " + findIndex(a,100));
	      System.out.println("Index position of 77 is: " + findIndex(a,400));
	

	}
}

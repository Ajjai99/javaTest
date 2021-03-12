package Javalab;

public class ReverseTwoDimensional
{
	
  public static void main(String[] args) 
  {
	  
	  int a[][] =  {{1,2,3,4,5},{8,6,4,5,3},{7,0,23,6,12}};
		for(int i=0 ; i<a.length; i++)
		{
			for(int j=0 ; j<a[i].length; j++)
		  {
			System.out.print(a[i][j]+ " ");
		   }
			System.out.println();
		}
		
		System.out.println();
		
		for(int k=0 ; k<a.length; k++)
		{
			for(int j =a[k].length-1 ; j>=0 ;j--)
		    {
			System.out.print(a[k][j]+ " ");
		    }
			System.out.println();
		}
	}
}


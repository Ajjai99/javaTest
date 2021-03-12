package Javalab;

public class Average 
{
    int sum  , avg ;
	int arr[] = {23,34,45,56,67};
	public  void total()
	{
		for(int i = 0 ; i < arr.length ; i++ )
		{
			 sum += arr[i];
			 System.out.println(sum);
		}
		avg = sum/5;
		 System.out.println("Average is "+ avg);
		
		
			
	}
	public static void main(String[] args) 
	{
		Average a1 = new Average();
		a1.total();
		
	}

}

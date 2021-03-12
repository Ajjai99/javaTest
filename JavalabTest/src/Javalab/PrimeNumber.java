package Javalab;

public class PrimeNumber 
{
	public static void main(String[] args) 
	
	{
		boolean x = false ;
		int number = 13;
		for(int i=2 ;i < number; i++ )
		{
			if(number%i == 0)
			{
				x = true;
				break;
				
			}
		}
		
		if( x == false)
		{
			System.out.println(number + "is a prime number");
		}
		else
		{
			System.out.println(number + "is not a prime number");
		}
	}
	

}

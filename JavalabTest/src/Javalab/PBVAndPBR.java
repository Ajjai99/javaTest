package Javalab;

public class PBVAndPBR {
	
	public static void main(String[] args) 
	{
		int number = 25;
		System.out.println("before calling display method number :"+ number);
		display(number);
		System.out.println("After calling display method number :"+ number);
		
		System.out.println();
		
		int value [] = {123,345};
		System.out.println("before calling displayArray method first element of value array :"+ value[0]);
		displayArray(value);
		System.out.println("After calling displayArray method first element of value array :"+ value[0]);
		
		
		
	}
	
	public static void display(int num)
	{
		System.out.println("Inside display method num :" + num);
		num = 100;
		System.out.println("inside display method num :" + num);
	}
	
	public static void displayArray(int values[])
	{
		System.out.println("Inside displayArray method first element :" + values[0]);
		values[0] = 50;
		System.out.println("Inside displayArray method first element :" + values[0]);
		
	}

}

package Javalab;

public class TypeCast {
	/*byte b1 = 124;
	short s1 = 10;
	int  i = 20;
    long l = 20000;
	float f = 23.4f;
	double d = 234.565757;
	String s = "Hello";*/
	public static void main(String[] args)
	
	{    byte b1 = 124; 
	     short s1 = b1; // implicit type casting
	     int  i = 200;
         long l = 20000;
	     float f = 23.4f;
	     double d = 234.565757;
	     String s = "Hello";
	     
	     int c = 100;
	     long a = c; // implicit type casting
	     float g= 234.45f;
	     int e = (int)g; // explicit type casting
	     float r = (float)c; // explicit type casting
	     
	     
	     
	     
	     System.out.println(e);
	     System.out.println(a);
	     System.out.println(r);
	     
		
		
	}
	

}

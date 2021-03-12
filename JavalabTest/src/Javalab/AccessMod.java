package Javalab;
class Access
{
	private int i =10;
	public int k =20 ;
	protected int p = 30;
	int j =40 ;
	
	private void met()
	{
		System.out.println("private method..");
	}
	
	public void met1()
	{
		System.out.println("public method..");
	}
	
	protected void met2()
	{
		System.out.println("protected method");
	}
	
	void met3()
	{
		System.out.println("nomodifier");
	}
	
}

public class AccessMod {
	
               public static void main(String[] args)
             {
            	   
            	   Access a1 = new Access();
            	   a1.met1();
            	   a1.met2();
            	   a1.met3();
            	  // a1.met(); // private method - accessible only within the class
            	   
            	   //System.out.println(a1.i);// private
            	   System.out.println(a1.k);
            	   System.out.println(a1.p);// protected - only within the class and subclass of same package and other package
            	   System.out.println(a1.j);
	
                }
}


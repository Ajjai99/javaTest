package Javalab;
class K
{
	static {
	   System.out.println("static block is called");
	}
	
	public K()
	{
		System.out.println("cons is called");
	}
	public static void met()
	{
		System.out.println("met is called..");
	}
	public static void met2()
	{
		System.out.println("met22 is called...");
	
	}
	
}

public class StaticBlock 
{
	public static void main(String[] args)
	{
		K.met();
		K.met2();
		
	}

}

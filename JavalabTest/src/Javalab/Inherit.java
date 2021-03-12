package Javalab;
class N
{
	public N()
	{
		
	}
}

class B extends N
{
	public B()
	{
		
	}
	
	public void display()
	{
		System.out.println("Display method in class B");
	}
	
}
public class Inherit extends B 

{
	public static void main(String[] args)
	
	{
		Inherit h1 = new Inherit();
		h1.display();
		
		
	}

}

package Javalab;

class Aim
{
	protected long l  = 3456;
	protected int i = 34;
	protected float f = 34.5f;
	
}

class Aim1 extends Aim
{
	public void display() 
	{
		System.out.println(super.l);
		System.out.println(super.i);
		System.out.println(super.f);
		
	}
	
}

public class ProtectedClass 
{
	public static void main(String[] args) 
	{
		Aim1 a1 = new Aim1();
		a1.display();
		
	}

}

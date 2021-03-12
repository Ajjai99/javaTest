package Javalab;
class ClassRoom1
{
	public ClassRoom1(int a)
	{
		System.out.println("In class N" + a);
		
	}
}

class Projectory extends ClassRoom1
{
	public  Projectory(int b)
	{
		super(10);
		System.out.println("In class B :" + b);
	}
	
	public void display()
	{
		System.out.println("Display method in class B");
	}
	
}
public class Constructor extends B 

{
	public Constructor(int c)
	{
		System.out.println("In class constructor :" + c);
	}
	
	public static void main(String[] args)
	
	{
		Constructor c1 = new Constructor(20);
		Projectory p1 = new Projectory(30);
		c1.display();
		
	}

}
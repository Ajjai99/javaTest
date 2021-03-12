package Javalab;

public class StaticVariables {
	
	
	// instance variable 2. class variable , 3. local variable
	// instance variables and class variables are initialized by default
	// local variables are not initialized by default
	
	 int i ; 
	 static int k;
	public void met()
	{
		int j;
		System.out.println(i);
		System.out.println(k);
		//System.out.println(j);

	}
	public static void main(String args[])
	{
    ClassRoom r1 = new ClassRoom();
    ClassRoom r2 = new ClassRoom();
	}
}

class ClassRoom
{
	static Canteen canteen = new Canteen();
	Projector projector = new Projector();
	
}

class Projector
{
	public Projector()
	{
	System.out.println("Profjector object created");
    }
}

class Canteen
{
	public Canteen()
	
	{
		System.out.println("canteen object created");
	}
	
}

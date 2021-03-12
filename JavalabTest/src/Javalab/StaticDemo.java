package Javalab;

public class StaticDemo {
	int i ;
	public static void main(String[] args)
	{/* by default main method is static , the reason is because the static method
	gets automatically loaded by JVM*/
	// Java Virtual Machine -> all java programs executed by this JVM. JVM is our environment which takes care of the execution of java program
	// static method will automatically loaded in the memory . JVM will search this main method
	// having main method is not an issue ,but that main method should be static
	// Static method can call another static method without creating the object of the class
	// Non-static method-> since they are not in the memory, they cannot be called directly by the static method
	// To call non-static methods , u have to create a object of the class
	// Static methods are always loaded by jvm by default
	// we don't need to create a object of the class , to call the static method.
	
    System.out.println("main method executed");
    StaticDemo d1 = new StaticDemo();
    d1.main(new char [] {'c','a'});
    main(new int [] {1,2,3});
    A.met();
    A.met2();
   
	}
    
    public static void main(int a[])
    {   // Static method cannot use super and this keywords
    	//super();  
    	//this i = 10;
    	
    }
    
    public void main(char c[])
    {        // non-static methods can use this and super keywords
    	     
    	super.toString();
    	this.i = 10;
    	// non-static method can call static methods without creating a object of the class
    	main(new int[] {1,2,3,4});
    	//A.met(); // static methods of another class should be  always called using class name.
    	
    }
    
    
	
}
// we can also call static method directly

// static block is used to initializing, and it gets called only once.... like constructor
class A
{
	static {
	   System.out.println("static block is called");
	}
	
	public A()
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

package Javalab;


//protected class base // we cannot use protected specifier 
public class base
{ 
	String Method()
    {
		return "Wow";
     } 
}
class dervied 
{ 
	public void useD() 
       { 
		 base z = new base(); 
         System.out.println("base says, " + z.Method());
          }
} 
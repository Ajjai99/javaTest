package Javalab;

class SingletonClass  
{   
   
   private static SingletonClass s = null;   
  
    public String str;   
   
    private SingletonClass()   
     {   
       str = "it is an example of singleton class.";   
     }   
  
     public static SingletonClass getInstance()   
      {   

           if (s== null)   
            s = new SingletonClass();   
            return s;   
           }   
}  

class Test  
{   
public static void main(String args[])   
{   

     SingletonClass a = SingletonClass.getInstance();   
 
     SingletonClass b = SingletonClass.getInstance();   
 
     

      a.str = (a.str).toUpperCase();   
      
        System.out.println("String from a is " + a.str);   
        System.out.println("String from b is " + b.str);   
            

}   
}   
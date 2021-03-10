# javaTest
package day2;

//public class Basic {
//public static void main(String args[])
//{
	// q1 - int  i =10;
	
	// q2 - error array must include parameter 
	
	/*q3 - package mypackage;
	        import java.awt.*;
	        class Myclass; */
	// q4 -> -128 to 127
	
	// q5 -> Exception raised
//}
//}
	
/*public class myprog
{ 
public static void main(String argv[])
	{ 
		System.out.println(argv[2])
	}

}*/

//q6 - if , goto, while, case - keywords

//q7 -> _whatever , _3_ , $another- legal identifiers

/*public class MyClass{ 
    static int i; 
    public static void main(String argv[])
           { 
            System.out.println(i); 
            } 
} */ 

// q8 -> 0

/*public class Q { 
    public static void main(String argv[])
    { 
            int anar[]=new int[]{1,2,3};
            System.out.println(anar[1]); 
            } 
}*/

// q9 -> 2

/*public class Q { 
    public static void main(String argv[])
    { 
            int anar[]=new int[5];
            System.out.println(anar[0]); 
        } 
}*/

// q10 -> 0

/*abstract class MineBase { 
    abstract void amethod(); 
    static int i; 
}
public class Mine extends MineBase      { 
    public static void main(String argv[])
    { 
        int[] ar=new int[5]; 
        for(i=0;i < ar.length;i++) 
        System.out.println(ar[i]); 
       } 
}*/

// q11 -> Mine must declare Abstract method

//public class Mine
//{
//    public static void main(String args[])
  //  {
/*int i=1; 
switch (i) 
{ 
 case 0: 
        System.out.println("zero"); 
        break; 
case 1: 
        System.out.println("one"); 
case 2: 
        System.out.println("two"); 
default: 
        System.out.println("default"); 
}
    }
}*/

// q12 -> One , two , default

/*    	int i=9; 
    	switch (i) { 
    	        default: 
    	        System.out.println("default"); 
    	                case 0: 
    	        System.out.println("zero"); 
    	                break; 
    	        case 1: 
    	                System.out.println("one"); 
    	        case 2: 
    	        System.out.println("two"); 
    	}

}
}*/
 //q13 -> default , zero.
  
 
 /* q14 ->boolean b=true; 
    	boolean b2=true; 
    	if(b==b2) { 
    	        System.out.println("So true"); 
    	        } */


 /*  import java.io.*; 
   public class Mine
   { 
    	public static void main(String argv[]){
        Mine m=new Mine(); 
    	System.out.println(m.amethod()); 
    	}
    	public int amethod() { 
    	        try {
    	                FileInputStream dis=new FileInputStream("Hello.txt"); 
    	                }
    	        catch (FileNotFoundException fne) 
    	        { 
    	                        System.out.println("No such file found"); 
    	                        return -1; 
    	           }
    	        catch(IOException ioe)
    	        { 
    	          } 
    	        finally
    	        { 
    	        System.out.println("Doing finally"); 
    	        } 
    	        return 0; 
    	        } 
    	} */
    
// q15 -> No such file found, Doing finally, -1

/*class Base {} 
class Sub extends Base {} 
class Sub2 extends Base {}
public class CEx{
        public static void main(String argv[]){
                Base b=new Base();
                Sub s=(Sub) b;
                }
}*/

/*<applet name=MgAp code=MgAp.class height=400 width=400 parameter HowOld=30 > 
</applet> 
import java.applet.*; 
import java.awt.*; 
public class MgAp extends Applet
{
        public void init()
        { 
                System.out.println(getParameter("age")); 
           } 
}*/

// q18-> Error : No such parameter


/*public class MyFor{
public static void main(String argv[]){ 
    int i; 
    int j; 
    outer: 
    for (i=1;i <3;i++) 
        inner: 
         for(j=1; j<3; j++) { 
                    if (j==2) 
                    continue outer; 
                    System.out.println("Value for i=" + i + " Value for j=" +j); 
                    } 
        } 
} */

//q21 -> Value for i=1 Value for j=1
//         Value for i=2 Value for j=1



/*class Base
{ 
    public void amethod(int i) 
    { 
    	
    }
} 

 public class Scope extends Base
 {
      public static void main(String argv[]){
      } */

// q23 ->void amethod(int i) throws Exception {} 

/*public class Base1
{
	public static void main(String args[])
	{
		System.out.println(Math.ceil(-4.7)); 
	}
}*/


//q24-> System.out.println(Math.ceil(-4.7)); 

/*public class Base1
{
	public static void main(String args[])
	{
     String s=new String("Bicycle"); 
    int iBegin=1; 
    char iEnd=3; 
     System.out.println(s.substring(iBegin,iEnd));
}
}*/

// q26 -> ic

/*public class Base1
{
	public static void main(String args[])
	{
		String s1=new String("Hello");
	    String s2=new String("there"); 
	    String s3=new String();
	    s3 = s1 && s2;
	    System.out.println(s3);
	}
}
	}*/

//q28 -> s3 = s1 + s2 ;

/*public class Base1
{
	public static void main(String args[])
	{
       System.out.println(4 | 3); 
	}
}*/

//q29 -> 7



/*public class Base1 {
public static void main(String argv[]){ } 
/*Modifier at XX */ 
//class MyInner {} } 

// q31-> public , private and static

/*class Background1 implements Runnable{ 
	  int i=0; 
	  public int run()
	  { 
	         while(true)
	         { 
	                i++; 
	                System.out.println("i="+i); 
	            } //End while

	     return 1;
	     }//End run 
	}//End class
public class Background2 
{
	public static void main(String args[])
	{
		Thread t1 = new Thread();
		t1.run();
	}
}*/


/*public class Pass{
static int j=20;
public static void main(String argv[]){
        int i=10;
        Pass p = new Pass();
        p.amethod(i);
        System.out.println(i);
        System.out.println(j);
        }
        public void amethod(int x){
        x=x*2;
        j=j*2;
        }
} */

// q41 -> 10 and 40 


public class Lin{
public static void main(String argv[]){
        Lin l = new Lin();
        l.amethod(); 
        }
        public void amethod(){
        int ia[] = new int[4];
                        //Start For loop        
         {
           ia[i]=i;
           System.out.println(ia[i]);
           }
        }
}

//q42 ->  for (int i=0; i< ia.length(); i++) 

//q43 -> Error at compile time



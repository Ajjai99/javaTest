package Javalab;


class X
{ 
	void do1()
	{
		
	} 
}  
class Y extends X 
{ 
   void do2() 
  { 
	
  }
} 

class Chrome
{ 
	public static void main(String [] args)
	{  X x1 = new X(); 
	   X x2 = new Y(); 
	   Y y1 = new Y(); 
	 //  x1.do1(); / * these all are 
	 //  y1.do2();      possible cases*/
	 //  y1.do1();
	 //  x2.do1();
	  //  x1.(Y)do1(); this will not supports
	   
	   } 
}

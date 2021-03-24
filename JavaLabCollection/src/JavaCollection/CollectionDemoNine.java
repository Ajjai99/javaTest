package JavaCollection;

import java.util.*;
   class Turtle {
	// ANS : 20-> A. If fragment I is inserted, the output is 2 
    int size;
   public Turtle(int s) { size = s; }
   public boolean equals(Object o) { return (this.size == ((Turtle)o).size); } 
   // insert code here
    public int hashCode() { return size/5; } 
   //  no hashCode method declared 
   }
    public class CollectionDemoNine
    {
    public static void main(String[] args) 
    {
     LinkedHashSet<Turtle> t = new LinkedHashSet<Turtle>();
    t.add(new Turtle(1)); t.add(new Turtle(2)); t.add(new Turtle(1));
    System.out.println(t);
    System.out.println(t.size());
   }
 } 
    
    
    
    
//  21 ->  A. If fragment I is inserted, the output is 2 
    
// 22 -> B. The size of s is 5 , F. The size of subs is 3 
    
    
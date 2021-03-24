package JavaCollection;
import java.util.*;
  public class CollectionDemo4 {
    public static void main(String[] args) {
      Object o = new Object();  
       Set s = new HashSet();
      //TreeSet s = new TreeSet();
      //LinkedHashSet s = new LinkedHashSet();
      s.add("o");
      s.add(o);
      System.out.println(s);
 }
 } 

  /* ANS : 9-> A. Fragment I compiles
         C. Fragment III compiles
         D. Fragment I executes without exception
         F. Fragment III executes without exception 
*/
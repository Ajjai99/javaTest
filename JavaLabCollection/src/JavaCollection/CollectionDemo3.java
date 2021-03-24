package JavaCollection;


import java.util.*;
class collectionDemo3 
{
	// ANS: 5-> A. As the code stands it will not compile , F. If the hashCode() method is uncommented the code will not compile 

public static void main(String[] args)
{
  Map<ToDos, String> m = new HashMap<ToDos, String>();
   ToDos t1 = new ToDos("Monday");
   ToDos t2 = new ToDos("Monday");
   ToDos t3 = new ToDos("Tuesday");
   m.put(t1, "doLaundry");
   m.put(t2, "payBills");
   m.put(t3, "cleanAttic");
   System.out.println(m.size());
} 
}
class ToDos
{
String day;
ToDos(String d) 
{ 
	day = d; 
	}
public boolean equals(Object o) 
{
return ((ToDos)o).day == this.day;
}
 public int hashCode() 
 {
	 return 9; 
}
}




/*6->All of the collection classes allow you to grow or shrink the size of your collection.
 *  ArrayList provides an index to its elements.*/

/* 7-> B. Change the Herbivore interface to interface Herbivore<E extends Animal> extends Hungry<E> {} 
 *  D. Change the Sheep class to class Sheep extends Plant implements Carnivore<Wolf> { public void
munch(Wolf x) {} } */

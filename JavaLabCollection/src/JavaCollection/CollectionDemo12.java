package JavaCollection;
import java.util.*;
public class CollectionDemo12 {
	// ANS: 24 -> D. The output will contain a –1 , G. The output will contain 
	public static void main(String[] args) {
		String[] s = {"map", "pen", "marble", "key"};
		Othello o = new Othello();
		Arrays.sort(s,o);
		for(String s2: s) 
			System.out.print(s2 + " ");
		    System.out.println(Arrays.binarySearch(s, "map"));
		}
	static class Othello implements Comparator<String> 
	{
		public int compare(String a, String b) 
		{ 
			return b.compareTo(a); 
		
		}
		}
	}     





// 25 -> B. List<List<Integer>> table = new ArrayList<List<Integer>>(); 

/* 27-> D.All of the collection classes allow you to grow or shrink the size of your collection.
*  ArrayList provides an index to its elements.*/

/*28 -> B. Change the Herbivore interface to interface Herbivore<E extends Animal> extends Hungry<E> {} 
*  D. Change the Sheep class to class Sheep extends Plant implements Carnivore<Wolf> { public void
munch(Wolf x) {} } */

// 29 ->


// 30 -> D. The before() method will not compile 

/* 31 -> D. If the hashCode() comparison == returns true, the equals() method might return true 
 *       
 */


// 32 -> B. List<List<Integer>> table = new ArrayList<List<Integer>>(); 

// 33->  D. The output will contain a –1 , G. The output will contain "pen marble map key" 




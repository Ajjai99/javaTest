package JavaCollection;
import java.util.*;
public class CollectionDemo 
{
	// ANS : 1-> C.  List<List<Integer>> table = new ArrayList<List<Integer>>();
	public static void main(String[] args) 
	{
		// INSERT DECLARATION HERE 
		  //List<List, Integer> table = new List<List, Integer>();
		  //List<List, Integer> table = new ArrayList<List, Integer>();
		  //List<List, Integer> table = new ArrayList<ArrayList, Integer>(); 
		//List<List<Integer>> table = new List<List<Integer>>();
		 List<List<Integer>> table = new ArrayList<List<Integer>>();
	    //List<List<Integer>> table = new ArrayList<ArrayList<Integer>>(); 

		for (int i = 0; i <= 10; i++) 
		{
		List<Integer> row = new ArrayList<Integer>();
		for (int j = 0; j <= 10; j++)
		row.add(i * j);
		table.add(row);
		}
		for (List<Integer> row : table)
		{
		System.out.println(row);
		}
	}            
	
}


/* 2-> D. If the hashCode() comparison == returns true, the equals() method might return true
 *  
 */

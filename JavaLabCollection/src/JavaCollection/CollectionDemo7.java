package JavaCollection;
import java.util.*;
public class CollectionDemo7
{
	// Answer: 14 ->  List<List<Integer>> table = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
	  //  List<Integer> table = new ArrayList<Integer>();
		 List<List<Integer>> table = new ArrayList<List<Integer>>();
		for (int i = 0; i <= 10; i++) {
		List<Integer> row = new ArrayList<Integer>();
		for (int j = 0; j <= 10; j++)
		row.add(i * j);
		table.add(row);
		}
		for (List<Integer> row : table)
		System.out.println(row);
		} 


}
  


 // 15-> D. If the hashCode() comparison == returns true, the equals() method might return true

 // 16-> E. The before() method will throw an exception at runtime

// 17-> A. As the code stands it will not compile , F. If the hashCode() method is uncommented the code will not compile 

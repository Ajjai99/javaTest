package JavaCollection;
import java.util.*;
public class CollectionDemo2
{
	public static void before() 
	{
		Set set = new TreeSet();
		set.add("2");
		set.add(3);
		set.add("1");
		Iterator it = set.iterator();
		while (it.hasNext()) 
		{
		System.out.print(it.next() + " ");
		}
	}
}
 //3 -> E. The before() method will throw an exception at runtime
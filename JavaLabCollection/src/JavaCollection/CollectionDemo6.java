package JavaCollection;
import java.util.*;
public class CollectionDemo6 
{
	// ANS: 11-> B. The Size of s is 5, F. The size of subs is 3
	public static void main(String[] args)
	{
	   TreeSet<String> s = new TreeSet<String>();
	   TreeSet<String> subs = new TreeSet<String>();
	    s.add("a"); s.add("b"); s.add("c"); s.add("d"); s.add("e");
	    subs = (TreeSet)s.subSet("b", true, "d", true);
	    s.add("g");
	    s.pollFirst();
	    s.pollFirst();
	    s.add("c2");
	    System.out.println(s.size() +" "+ subs.size()); 
	}

}
  
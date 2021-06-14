import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;
class Treesets
{
	public static void main(String [] args)
	{
		TreeSet ts = new TreeSet();
		ts.add("HEADLINE");
		ts.add("26.10.1998");
		ts.add("monday");
		ts.add("Dhananjayan");
		ts.add("Bday");
		System.out.println(ts);
		SortedSet ss = ts.headSet("Dhananjayan");//headSet
		System.out.println(ss);
		SortedSet ss1 = ts.tailSet("Dhananjayan");//tailSet
		System.out.println(ss1);
		SortedSet ss2 = ts.subSet("Bday","monday");//subset
		System.out.println(ss2);
		System.out.println(ts.first());
		Iterator i = ts.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
import java.util.HashSet;
import java.util.Iterator;
class Hashset
{
	public static void main(String [] args)
	{
		HashSet hs = new HashSet();
		hs.add("Dj");
		hs.add(26);
		hs.add(10.98);
		hs.add(new Hashset());
		hs.add(null);
		System.out.println(hs);
		hs.remove(null);
		boolean b = hs.contains("Dj");
		System.out.println(b);
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		hs.clear();
		System.out.println(hs);
	}
}
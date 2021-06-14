import java.util.TreeMap;
class Treemap
{
	public static void main(String [] args)
	{
		TreeMap <String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("one",1);
		tm.put("two",2);
		tm.put("three",3);
		tm.put("four",4);
		tm.put("five",5);
		System.out.println(tm);
	}
}
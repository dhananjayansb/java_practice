import java.util.LinkedHashMap;
class Linkedhashmap
{
	public static void main(String [] args)
	{
		LinkedHashMap <Integer,String> lhm = new LinkedHashMap <Integer,String> ();
		lhm.put(1,"one");
		lhm.put(2,"two");
		lhm.put(3,"three");
		lhm.put(4,"four");
		lhm.put(5,"five");
		System.out.println(lhm);
	}
}
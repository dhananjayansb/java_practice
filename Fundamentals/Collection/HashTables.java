import java.util.Hashtable;
class HashTables
{
	public static void main(String [] args)
	{
		Hashtable ht = new Hashtable();
		ht.put("one",1);
		ht.put("two",2);
		ht.put("three",3);
		ht.put("four",4);
		ht.put("five",5);
		// wrong -------- ht.put(null,6);-------- // no null in key or value
		System.out.println(ht);
	}
}
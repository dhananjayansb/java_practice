import java.util.HashMap;
import java.util.Map;
class Hashmap
{
	public static void main(String [] args)
	{
		HashMap <Integer,String> hm = new HashMap <Integer,String> ();
		hm.put(1,"one");
		hm.put(2,"two");
		hm.put(3,"three");
		hm.put(4,"four");
		hm.put(5,"five");
		System.out.println(hm);
		for(Map.Entry k:hm.entrySet())//to print only keys
		{
			System.out.print(k.getKey()+" ");
		}
		System.out.println();//nextline sapce
		for(Map.Entry k:hm.entrySet())//to print only values
		{
			System.out.print(k.getValue()+" ");
		}
		System.out.println();//nextline sapce
		HashMap h = new HashMap();
		h.put("Dj","Rog");
		h.put(8,"Rog");
		h.put(9,"Foreva");
		h.putAll(hm);
		System.out.println(h);
	}
}
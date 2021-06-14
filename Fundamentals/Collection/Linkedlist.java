import java.util.LinkedList;
class Linkedlist 
{
	public static void main(String [] args)
	{
		LinkedList n = new LinkedList();
		n.add("Numbers");
		n.add("1 to 5");
		n.add(26);
		n.add(true);
		n.add(null);
		System.out.println(n);
		n.addFirst("Add overload");
		n.offer("added last");	
		Object p = n. poll();
		System.out.println(n);
		Object k = n.getFirst();
		String s = (String)k;
		System.out.println(s);
	}
}
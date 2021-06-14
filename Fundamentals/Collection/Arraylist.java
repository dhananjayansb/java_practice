//Collection = Framework
import java.util.ArrayList;
import java.util.Collections;
class Arraylist
{
	public static void main(String [] args)
	{
		ArrayList al = new ArrayList();//we should have empty constructor
		// ---------------ADD Object------------- 	 	
		al.add(26);
		al.add(10);
		al.add(1998);
		al.add("DJ");
		al.add("DJ");
		al.add(false);
		al.add(5,"Using constructor");//void return type
		
		// ---------------Check Object-------------
		boolean b = al.contains("DJ");//boolean return type
		
		// ---------------Remove Object-------------
		al.remove("Using constructor");

		// ---------------get Object,Index of Obj-------------
		Object o = al.get(2);//Object return type
		Integer f = (Integer)o;//typecasting
		int k = al.indexOf(1998);//wrapper class converted 
		int l = al.lastIndexOf(1998);
	
		//--------------size of coolection----------
		int size = al.size();
		System.out.println(size);
		Object[] arr = al.toArray();
		System.out.println("Elements in order");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		al.add(null);
		//---------Print collection----------------
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(b);
		System.out.println(f+" "+k+"th Index " + l);
		//----------clear and print collection--------------
		al.clear();//void return type
		System.out.println(al);
		
		//------------onlystring-----------------
		ArrayList <String> a2 = new ArrayList<String>();
		a2.add("dj");
		a2.add("rog");
		System.out.println(a2);
	}
}
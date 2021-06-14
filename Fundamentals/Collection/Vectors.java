import java.util.Vector;
import java.util.Enumeration;
class Vectors
{
	public static void main(String [] args)
	{
		Vector v = new Vector(5,2);
		v.add("DJ");
		v.add("Bday");
		v.add(26);
		v.add(10);
		v.add(1998);
		v.add(null);
		v.add("10.26 PM");
		int k = v.capacity();
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}

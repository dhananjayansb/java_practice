class Wrapping extends Object
{
	int y;
	public String toString()
	{
		return ""+y;
	}
	Wrapping(int k)
	{
		y = k;
	}
}
class WrapperAPI 
{
	public static void main(String [] args)
	{
		//---------------Integer-------------------
		Integer i = Integer.valueOf(34);//this also calls toString method
		Integer j = Integer.valueOf(26);
		System.out.println(i);
		Wrapping w = new Wrapping(45);//this calls constructor
		System.out.println(w);//obj reference will call toString method always
		int a = i+j;
		System.out.println(a);
		int c = i.intValue();
		int d = j.intValue();
		int b = c+d;
		System.out.println(b);
		//------------Integer-String---------------
		String s1 = "20";
		String s2 = "5";
		Integer e = Integer.valueOf(s1);
		Integer f = Integer.valueOf(s2);
		int sum = e+f;
		System.out.println(sum);
		//------------parseInt---------------------
		int g = Integer.parseInt(s1);
		int h = Integer.parseInt(s2);
		int p = g+h;
		System.out.println(p);
		System.out.println(Integer.SIZE + " " + Integer.MAX_VALUE +" "+ Integer.MIN_VALUE);
	}
}

abstract class one
{
   public abstract void m1();
   void m2()
   {
		System.out.println("abstract class");
   }
}

class Abstract extends one
{
	public void m1()
	{
	System.out.println("Abstract class inherited");
	}
	public static void main(String [] args)
	{
		Abstract x=new Abstract();
		x.m2();
		x.m1();
	}
	
}
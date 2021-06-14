//Method overriding
class superc
{
	void m1(int a)
	{
		int b=a*a;
		System.out.println(b);
	}
}
class Override extends superc
{
	protected void m1(int a)//overridden
	{
		int b=a*a;
		System.out.println(b);
		super.m1(10);//super keyword must be used only in non static block 
	}
	
	public static void main(String [] args)
	{
		Override o=new Override();
		o.m1(10);
	}
}
//Method Overloading
class Overload
{
	int areas(int a, int b)	
	{
		return a*b;
	}
	
	float areas(float a)
	{
		return 3.14f*a*a;
	}
	
	public static void main(String [] args)
	{
		Overload x=new Overload();
		int r=x.areas(10,30);
		System.out.println(r);
		float c=x.areas(10.2f);
		System.out.println(c);
	}
}

//Constructor and Constructor Overloading

class one    //extends Object
{
		int a=45;
	//user-defined constructor
	one(int k)
	{
		super();
		System.out.println("Constructor generated for one");
		System.out.println(k);
	}
	one(boolean b)
	{
		this(4);
		System.out.println("Constructor generated for one");
		System.out.println(b);
	}
	
}

class Constructors extends one
{
	int b=54;
	//user-defined constructor
	public Constructors(float x)
	{
		super(true);
		System.out.println("Constructor generated for constructors with parameter");
	}
	public Constructors(int m)
	{
		this(42.25f); // calls constructor with parameter
		System.out.println("Constructor generated for constructors without parameter");
	}
	
	public static void main(String [] args)
	{
		Constructors o=new Constructors(20);
		System.out.println(o.a);
		System.out.println(o.b);
	}
}
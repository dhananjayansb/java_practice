class c1{
	int a=10;
	void m1()
	{
		System.out.println("class 1");
	}
}
class Prg1 extends c1{
	int b= 26;
	void m2()
	{
		System.out.println("class 2");
	}
	
	public static void main(String [] args)
	{
		Prg1 y=new Prg1();
		//c1 x=new c1();
		System.out.println("two classes");
		System.out.println(y.a);
		y.m1();
		System.out.println(y.b);
		y.m2();
	}
}
//Multi level inheritance
class super1{
	int a=10;
	void m1()
	{
		System.out.println("class 1");
	}
}
class super2 extends super1{
	int b=10;
	void m2()
	{
		System.out.println("class 2");
	}
}
class Multilevel extends super2{
	int c= 26;
	void m3()
	{
		System.out.println("class 3");
	}
	
	public static void main(String [] args)
	{
		Multilevel y=new Multilevel();
		System.out.println("three classes");
		System.out.println(y.a);
		y.m1();
		System.out.println(y.b);
		y.m2();
		System.out.println(y.c);
		y.m3();
	}
}
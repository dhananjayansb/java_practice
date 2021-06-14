//instance creation,static and non static
class test1{
	
	int g=76; //member of class test1
	void test(){
		System.out.println("Success");
	}
	void m2(){
		int a=22;
		System.out.println(a);
		System.out.println(g);//Non-static to Non static so no need of obj
		test();
	}
	public static void main(String [] args)
	{
		test1 t = new test1();
		t.m2();//static to non static need obj
	}
}
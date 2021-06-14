//basic 
class test{
	
	int g=76; //global variable or class variable
	void test1(){
		System.out.println("Success");
	}
	public static void main(String [] args)
	{
		int a=26; //method variable or local variable
		test t = new test();
		System.out.println("Hello Dj");
		System.out.println(a);
		t.test1();
		System.out.println(t.g);//calling global variable
	}
}
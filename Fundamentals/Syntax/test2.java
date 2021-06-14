//return type,return statement,reusability
class test2{

	test2 m2(){
		int a=22;
		System.out.println(a);
		return new test2();
	}
	public static void main(String [] args)
	{
		test2 t = new test2();
		t.m2();
	}
}
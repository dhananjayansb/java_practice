interface exe
{
	int a = 26;
	
}

class Interface implements exe//not extends --- implements *****
{
	public static void main(String [] args)
    {
		Interface i= new Interface();
		System.out.println(i.a);
	}
}
	
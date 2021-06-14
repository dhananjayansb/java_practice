class ExceptionAPI
{
	int a = 26;
	public static void main(String [] args)
	{
		ExceptionAPI ex = new ExceptionAPI();
		System.out.println("Before Exception");
		int k = 34;
		//-----------ArithmeticException---------------
		for(int i=-1;i<1;i++)
		{
				int x= 0;
			try
			{
				x = k/i;
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(x);
			System.out.println("Passed ArithmeticException");
		}
		
		//--------NullpointerException-----------------------
		System.out.println(ex.a);
		ex = null;
		try
		{
			System.out.println(ex.a);
		}
		catch(NullPointerException e)
		{
			System.out.println("NullException");
		}
		System.out.println("Passed NullPointerException");
		
		//----------IndexOutOfBoundsException------------------
		int A[] = new int[] {1,2,3,4,5};
		int len = A.length;
		for(int i=0;i<len;i++)
		{
			System.out.println(A[i]);
		}
		try
		{
			System.out.println(A[len]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println("Passed ArrayIndexOutOfBoundsException");
	}	
}
class S1
{
	void multi(int n)
	{
		System.out.println("hellooooo");
		synchronized(this)
		{
			Thread t = Thread.currentThread();
			String s = t.getName();
			System.out.println(s);
			for(int i=1 ; i<4 ; i++)
			{
				System.out.println(i*n);
			}
		}
	}
}

class S2 extends Thread
{
	S1 s;
	S2(S1 s)
	{
		this.s =s;
	}
	public void run()
	{
		s.multi(5);
	}
}

class S3 extends Thread
{
	S1 s;
	S3(S1 s)
	{
		this.s = s;
	}
	public void run()
	{
		s.multi(5);
	}
}

class Sync 
{
	public static void main(String [] args)
	{
		S1 s1 = new S1();
		S2 s2 = new S2(s1);	
		S3 s3 = new S3(s1);
		s2.setName("Thread 2");
		s3.setName("Thread 3");
		s2.start();
		s3.start();
	}
}
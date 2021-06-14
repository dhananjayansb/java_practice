class Threads
{
	public void  run()
	{
		try 
		{
			Thread.sleep(500);			
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Thread called using interface and sleep method used");
	}
}
class Run extends Threads implements Runnable
 {
	public static void main(String [] args)
	{
		Run r1 = new Run();
		Run r2 = new Run();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		try{
			t1.join(1000);
		}
		catch(InterruptedException e){}
		t2.start();
	}
}
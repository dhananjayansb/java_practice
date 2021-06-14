class ThreadAPI extends Thread
{
	public void run()
	{
		Thread th = Thread.currentThread();
		String s = th.getName();
		System.out.println(s+" : Thread API");
	}
	public static void main(String [] args)
	{
		ThreadAPI t1 = new ThreadAPI();//thread one 
		ThreadAPI t2 = new ThreadAPI();//thread two
		t1.setName("Thread 1");//setName for thread 1
		t2.setName("Thread 2");//setName for thread 2
		t1.setPriority(Thread.MAX_PRIORITY);//setPriority for Thread 1
		t2.setPriority(6);// priority ranges 1 - 10
		int p1 = t1.getPriority();//get priority for t1
		int p2 = t2.getPriority();
		System.out.println(p1+" "+p2);
		t1.start();
		t2.start();
	}
}
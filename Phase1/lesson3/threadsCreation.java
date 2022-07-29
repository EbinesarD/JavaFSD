package lesson3;

class Thread1 extends Thread
{
	public void run()
	{
		try 
		{
			Thread.sleep(2000);
			System.out.println("Thread "+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		try {
			Thread.sleep(5000);
			System.out.println("Thread "+Thread.currentThread().getName());
			}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}
}
public class threadsCreation 
{
	public static void main(String[] args) 
	{
		Thread1 t1 = new Thread1();
		t1.setName("1");
		t1.start();
		Thread t2 = new Thread(new Thread2());
		t2.setName("2");
		t2.start();
		
		
	}
}

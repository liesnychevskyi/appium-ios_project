package appium_core.java_core.Threads;

public class Demo extends Thread
{
	public static void main(String[] args) 
	{
		Demo demo = new Demo();
		demo.start();
		
		Demo demo_1 = new Demo();
		demo_1.start();

	}

	@Override
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getId() + "Value " + i);
		}
		try 
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	

}

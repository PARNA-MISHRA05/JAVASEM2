//join method in thread
class display1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("*");
		}
	}
}
class display2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("/");
		}
	}
}
public class Patternthread
{
	public static void main(String args[])
	{
		display1 d=new display1();
		display2 d1=new display2();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d1);
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e){}
		t2.start();
	}
}
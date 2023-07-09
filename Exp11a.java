class Table5 extends Thread
{
	public void run()
	{
		System.out.println("TABLE OF 5 : ");
		for(int i=1;i<=10;i++)
		{
			System.out.println("5\tX\t"+i+"\t="+(5*i));
		}
	}
}
class Table7 extends Thread
{
	public void run()
	{
		System.out.println("TABLE OF 7 : ");
		for(int i=1;i<=10;i++)
		{
			System.out.println("7\tX\t"+i+"\t="+(7*i));
		}
	}
}
class Table13 extends Thread
{
	public void run()
	{
		System.out.println("TABLE OF 13 : ");
		for(int i=1;i<=10;i++)
		{
			System.out.println("13\tX\t"+i+"\t="+(13*i));
		}
	}
}
public class Exp11a
{
	public static void main(String args[])
	{
		Table5 a=new Table5();
		Table7 b=new Table7();
		Table13 c=new Table13();
		Thread t1=new Thread(a);
		
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		t1.start();
		try{
		Thread.sleep(100);
		}catch(Exception e)
		t2.start();
		try{
		Thread.sleep(100);
		}catch(Exception ie)
		t3.start();
	}
}
class Table8 extends Thread
{
	public void run()
	{
		System.out.println("TABLE OF EIGHT: ");
		for(int i=1;i<6;i++)
		{
			System.out.println("8\tX\t"+i+"="+(8*i));
		}
	}
}
class Table4 extends Thread
{
	public void run()
	{
		System.out.println("TABLE OF FOUR: ");
		for(int i=1;i<11;i++)
		{
			System.out.println("4\tX\t"+i+"="+(4*i));
		}
	}
}
public class Table
{
	public static void main(String args[])
	{
		Table8 a=new Table8();
		Table4 b=new Table4();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
		try{
		t1.join();
		}catch(Exception e){}
		t2.start();
	}
}
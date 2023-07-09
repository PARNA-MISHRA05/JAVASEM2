//synchronised methods to avoid multiple book issue in library

class Lib extends Thread
{
	int issued=1,req;
	public Lib(int x)
	{
		req=x;
	}
	public synchronized void run()
	{
		if(issued>=req)
		{
			System.out.println(req+" book issued for"+Thread.currentThread().getName());
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e){}
			issued-=1;
		}
		else 
			System.out.println("BOOK  NOT AVAILABLE FOR "+Thread.currentThread().getName());
	}
}
public class Librarythread
{
	public static void main(String args[])
	{
		Lib obj=new Lib(1);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("PARNA");
		t2.setName("MISHRA");
		t1.start();
		t2.start();
	}
}

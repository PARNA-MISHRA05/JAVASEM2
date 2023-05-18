import java.util.*;
class ObjectCounter
{
	private static int count=0;
	public ObjectCounter()
	{
		count++;
	}
	public static void display()
	{
		System.out.println("THE NUMBER OF OBJECT CREATED : "+count);
	}
}
public class Exp6a
{
	public static void main(String args[])
	{
		ObjectCounter obj1=new ObjectCounter();
		
		ObjectCounter obj2=new ObjectCounter();
		
		ObjectCounter obj3=new ObjectCounter();
		ObjectCounter.display();
	}
}

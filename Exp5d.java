import java.util.*;
class ObjectCount
{
	private static int count=0;
	public ObjectCount()
	{
		count++;
	}
	public static void display()
	{
		System.out.println("THE NUMBER OF OBJECTS CREATED : "+count);
	}
}
public class Exp5d
{
	public static void main(String args[])
	{
		ObjectCount obj1=new ObjectCount();
		ObjectCount obj2=new ObjectCount();
		ObjectCount obj3=new ObjectCount();
		ObjectCount obj4=new ObjectCount();
		ObjectCount.display();
	}
}

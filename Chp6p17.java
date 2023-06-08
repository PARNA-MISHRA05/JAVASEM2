class Base
{
	public static void display(int a)
	{
		System.out.println("this is main class ,  value is : "+a);
	}
}
class Child extends Base
{
	public static void display(double a)
	{
		System.out.println("this is main class ,  value is : "+a);
	}
}
public class Chp6p17
{
	public static void main(String args[])
	{
		Base.display(5);
		Child.display(5.0);
	}
}
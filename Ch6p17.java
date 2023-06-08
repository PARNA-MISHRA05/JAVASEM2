//METHOD OVERLOADING IN PARENT AND CHILD CLASS
class Base
{
	public  void display(int a)
	{
		System.out.println("this is main class ,  value is : "+a);
	}
}
class Child extends Base
{
	public  void display(double a)
	{
		super.display(89);
		System.out.println("this is child class ,  value is : "+a);
	}
}
public class Ch6p17
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.display(5);
		c.display(5.0);
	}
}
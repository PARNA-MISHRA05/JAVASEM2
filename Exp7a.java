class A
{
	public void display()
	{
		System.out.println("IN CLASS A") ;
	}
}
class B extends A
{
	public void display1()
	{
		System.out.println("IN CLASS B") ;
	}
}
class C extends B
{
	public void display2()
	{
		System.out.println("IN CLASS C") ;
	}
}
public class Exp7a
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.display();
		obj.display1();
		obj.display2();
	}

			
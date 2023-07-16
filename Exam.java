import java.util.*;
class Parent
{
	protected int r;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);		   			
		System.out.println("ENTER RADIUS: ");
		r=sc.nextInt();
	}
}
class Child extends Parent
{
	private int area;
	public void display()
	{
		area=r*r;		  
		System.out.println("AREA IS :  "+area);
		
	}
}

public class Exam
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.accept();
		c.display();
	}
}

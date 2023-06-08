//

import java.util.*;

class Circle
{
	protected float r;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE RADIUS : ");
		r=sc.nextFloat();
	}
}
class Area extends Circle
{
	protected float area;
	public void cal()
	{
		area=3.14f*r*r;
	}
	public void display()
	{
		System.out.println("AREA IS "+area);
	}
}
class Circum extends Area
{
	protected float cir;
	public void cal()
	{
		cir=3.14f*r*2;
	}
	public void display()
	{
		System.out.println("CIRCUMFERENCE IS "+cir);
	}
}
public class Dynamic
{
	public static void main(String args[])
	{
		Area ref;
		Area a=new Area();
		Circum c=new Circum();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.AREA\n2.CIRCUMFERENCE\nENTER CHOICE : ");
		int choice=sc.nextInt();
		if(choice==1) ref=a;
		else 
			ref=c;
		ref.accept();
		ref.cal();
		ref.display();
	}
}

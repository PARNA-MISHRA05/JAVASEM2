//Write an abstract class program to calculate area of circle, rectangle and triangle.

import java.util.*;
abstract class Shape
{
	abstract public void read();
	abstract public void calc();
	abstract public void display();
}
class Circle extends Shape
{	
 	private double radius,area;
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE RADIUS : ");
		radius=sc.nextInt();
	}
	public void calc()
	{
		area=3.14*radius*radius;
	}
	public void display()
	{
		System.out.println("THE AREA OF CIRCLE IS : "+area);
	}
}
class Rectangle extends Shape
{	
 	private double l,b,area;
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE LENGTH AND BREADTH : ");
		l=sc.nextDouble();
		b=sc.nextDouble();

	}
	public void calc()
	{
		area=l*b;
	}
	public void display()
	{
		System.out.println("THE AREA OF RECTANGLE IS : "+area);
	}
}
class Triangle extends Shape
{	
 	private double b,h,area;
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE BASE AND HEIGHT : ");
		b=sc.nextDouble();
		h=sc.nextDouble();
	}
	public void calc()
	{
		area=0.5*b*h;
	}
	public void display()
	{
		System.out.println("THE AREA OF CIRCLE IS : "+area);
	}
}

public class Exp9a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.CIRCLE\n2.RECTANGLE\n3.TRIANGLE\nENTER CHOICE : ");	
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: Circle c=new Circle();
					c.read();
					c.calc();
					c.display();
					break;	
			case 2: Rectangle r=new Rectangle();
					r.read();
					r.calc();
					r.display();
					break;				
			case 3: Triangle t=new Triangle();
					t.read();
					t.calc();
					t.display();
					break;	
			default:System.out.println("INVALID CHOICE !!");
			}
	}
}

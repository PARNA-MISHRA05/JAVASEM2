import java.util.*;
class Circle
{
	
	float r,area;
	public Circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER RADIUS : ");
		r=sc.nextFloat();
	}
	Circle(Circle x)
	{
		r=x.r;
	}
	void calculate()
	{
		area=3.14f*r*r;
	}	
	void display()
	{	
		System.out.println("AREA IS : "+area);
	}
}
public class COPY
{
	public static void main(String args[])
	{
		Circle obj= new Circle();
		obj.calculate();
		
		Circle c1= new Circle(obj);
		c1.calculate();
		c1.display();
	}
}
	

		
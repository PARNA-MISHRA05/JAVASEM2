import java.util.*;
class Shape
{
	public static void cal(int l,int b)
	{
		float area;
		
		area=l*b;
		System.out.println("AREA OF RECTANGLE : "+area);
	}

	public static void cal(float r)
	{
		float area;
		
		area=3.14f*r*r;
		System.out.println("AREA OF CIRCLE : "+area);
	}
	public static void cal(double b,double h)
	{
		double area;
		
		area=0.5*b*h;
		System.out.println("AREA OF TRIANGLE : "+area);
	}
}
public class Ch6p15
{
	public static void main(String args[])
	{
		Shape.cal(10);
		Shape.cal(10,5);
		Shape.cal(6.0,10.0);
	}
}

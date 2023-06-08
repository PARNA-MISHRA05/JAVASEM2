import java.util.*;
class Shape
{
	public Shape()
	{
		float l,area;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE LENGTH : ");
		l=sc.nextInt();
		area=l*l;
		System.out.println("AREA OF SQUARE: "+area);
	}
	public Shape(float r)
	{
		float area;
		
		area=3.14f*r*r;
		System.out.println("AREA OF CIRCLE : "+area);
	}
	public Shape(float l,float b)
	{
		float area;
		
		area=l*b;
		System.out.println("AREA OF RECTANGLE : "+area);
	}
}
public class Ch6p14
{
	public static void main(String args[])
	{
		Shape s= new Shape();	
		Shape c=new Shape(10);
		Shape r=new Shape(5,10);
	}
}

		
	
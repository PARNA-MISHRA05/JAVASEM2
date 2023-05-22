import java.util.*;
class Circle
{
	private float r,area;
	public Circle()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE RADIUS " );
		r=sc.nextFloat();
	}
	void calculate()
	{
		area=3.142f*r*r;	
	}
	void display()
	{
		System.out.println("AREA IS : "+area);
	}
}	
class Constructor
{
	public static void main(String args[])
	{
		Circle obj= new Circle();
		obj.calculate();
		obj.display();
	}
}

	
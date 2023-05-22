class Circle
{
	private float radius,area;
	public Circle()
	{
	}
	public Circle(float rad)
	{
		radius=rad;po 
	}
	void calculate()	
	{
		area=3.14f*radius*radius;
	}
	void display()
	{
		System.out.println("AREA IS : "+area);
	}
}
public class Parameter
{
	public static void main(String args[])
	{
		Circle obj=new Circle();
		Circle c= new Circle(10);
		c.calculate();
		c.display();
	}
}

		
	
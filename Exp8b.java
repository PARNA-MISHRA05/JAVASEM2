//Demonstrate that a variable is constant, method cannot be overridden, class cannot be inherited 
//using final keyword
import java.util.*;

class B
{
	final public void display()	
	{
		System.out.println("THIS IS CLASS B : ");
	}
}
class C extends B
{
	public void display()
	{
	System.out.println("THIS IS CLASS C :");
}}
		
class Exp8b
{
	public static void main(String args[])
	{

	final int radius=10;
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER RADIUS : ");
	radius=sc.nextInt();//ANY VALUE ENTERED THE ANSWER WILL BE 314.O
	float area=3.14f*radius*radius;
	System.out.println("AREA IS : "+area);
	C obj=new C();
	obj.display();//although we call class C, class B's method will be called
	}

}

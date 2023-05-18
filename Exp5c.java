import java.util.*;
class Complex
{
	float r,i;
	
	Complex add(Complex c2)
	{
		Complex c3 = new Complex();
		c3.r=r+c2.r;
		c3.i=i+c2.i;
		return c3;
	}
	Complex sub(Complex c2)
	{
		Complex c3= new Complex();
		c3.r=r-c2.r;
		c3.i=i-c2.i;
		return c3;

	}
	void display()
	{	

		System.out.println(r+" +i("+i+")");
	}
}
public class Exp5c
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Complex c1= new Complex();
		Complex c2= new Complex();
		System.out.println("ENTER REAL AND IMAGINARY PART OF FIRST COMPLEX NUMBER : ");
		c1.r=sc.nextFloat();
		c1.i=sc.nextFloat();
		System.out.println("ENTER REAL AND IMAGINARY PART OF SECOND COMPLEX NUMBER : ");
		c2.r=sc.nextFloat();
		c2.i=sc.nextFloat();
		System.out.println("1.ADD\n2.SUBTRACT\nENTER CHOICE : ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:Complex sum=c1.add(c2);
				System.out.println("SUM IS : ");
				sum.display();
			 break;
			
			case 2:Complex diff=c1.sub(c2);
				System.out.println("DIFFERENCE  IS : ");
				diff.display();
			 break;
			default: System.out.println("INVALID " );		
		}
	}
}

			


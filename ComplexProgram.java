import java.util.*;
class Complex
{
	static float r,i;
	Complex add(Complex c2)
	{
		Complex c3= new Complex();
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
	public static void display()
	{
		System.out.println("ANSWER IS : "+r+"+ i("+i+")");
	}
}
public class ComplexProgram
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		Complex c1= new Complex();
		Complex c2= new Complex();
		System.out.println("ENTER THE REAL AND IMAGINARY PART OF THE FIRST COMPLEX NUMBER : ");
		c1.r=sc.nextInt();
		c1.i=sc.nextInt();
		System.out.println("ENTER THE REAL AND IMAGINARY PART OF THE SECOND COMPLEX NUMBER : ");
		c2.r=sc.nextInt();
		c2.i=sc.nextInt();
		System.out.println("1.ADD\n2.SUBTRACT\nENTER CHOICE : ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1: Complex sum= new Complex();
					sum=c1.add(c2);
					sum.display();break;

			case 2: Complex diff= new Complex();
					diff=c1.sub(c2);
					diff.display();break;
			default: System.out.println("invalid choice " );
		
		}
	}
}


		
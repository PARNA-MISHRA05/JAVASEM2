import java.util.*;
public class Exp5b
{
	public void area(int S)
	{
		System.out.println("AREA : "+(S*S));
	}
	public void area(int l,int b)
	{
		System.out.println("AREA : "+(l*b));
	}	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Exp5b obj= new Exp5b();
		System.out.println("1.SQUARE\n2.RECTANGLE\nENTER CHOICE ");
		
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("ENTER SIDE : ");
					int s=sc.nextInt();
					obj.area(s);break;
			case 2:System.out.println("ENTER length and breadth : ");
					int l=sc.nextInt();
					int b=sc.nextInt();
					obj.area(l,b);break;
			default: System.out.println("invalid" );
			
		}
	}
}

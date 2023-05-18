import java.util.*;
public class Exp5a
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
		Exp5a obj= new Exp5a();
		System.out.println("1.SQUARE\n2.RECTANGLE\nENTER CHOICE ");
		
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("ENTER SIDE : ");
					int s=sc.nextInt();
					obj.area(s);
			
		}
	}
}

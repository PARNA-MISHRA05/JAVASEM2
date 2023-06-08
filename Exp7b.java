import java.util.*;
class Staff
{
	protected int code;
	protected String name;
}
class Teacher extends Staff
{
	private String sub;
	private int exp;
	public void read()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE NAME,CODE,SUBJECT AND EXPERIENCE OF THE TEACHER: ");
		name=sc.nextLine();
		code=sc.nextInt();
		sc.nextLine();
		sub=sc.nextLine();
		
		exp=sc.nextInt();
	}
		
	public void display()
	{
		System.out.println("NAME\tCODE\tSUBJECT\tEXPERIENCE: ");
		System.out.println(name+"\t"+code+"\t"+sub+"\t"+exp);
	}
}
class Officer extends Staff
{
	private String dept,grade;
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE NAME,CODE,DEPARTMENT AND GRADE OF THE OFFICER: ");
		name=sc.nextLine();
		code=sc.nextInt();
		dept=sc.nextLine();
		grade=sc.nextLine();
	}
		
	public void display()
	{
		System.out.println("NAME\tCODE\tDEPT\tGRADE: ");
		System.out.println(name+"\t"+code+"\t"+dept+"\t"+grade);
	}
}
class Typist extends Staff
{
	protected int speed,exp;
	
}

class Regular extends Typist
{
	private int sal;
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE NAME,CODE,SPEED,EXP. AND SALARY OF THE OFFICER: ");
		name=sc.nextLine();
		code=sc.nextInt();
		speed=sc.nextInt();
		exp=sc.nextInt();
		sal=sc.nextInt();
	}
		
	public void display()
	{
		System.out.println("NAME\tCODE\tSPEED\tEXP\tSALARY: ");
		System.out.println(name+"\t"+code+"\t"+speed+"\t"+exp+"\t"+sal);
	}
}
class Casual extends Typist
{
	private int daily_wages;
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE NAME,CODE,SPEED,EXP. AND DAILY WAGE OF THE OFFICER: ");
		name=sc.nextLine();
		code=sc.nextInt();
		speed=sc.nextInt();
		exp=sc.nextInt();
		daily_wages=sc.nextInt();
	}
		
	public void display()
	{
		System.out.println("NAME\tCODE\tSPEED\tEXP\tDAILY WAGES: ");
		System.out.println(name+"\t"+code+"\t"+speed+"\t"+exp+"\t"+daily_wages);
	}
}

public class Exp7b
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.TEACHER\n2.TYPIST\n3.OFFICER\nENTER CHOICE: ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:Teacher t=new Teacher();
					t.read();
					t.display();
					break;
			case 3:Officer o=new Officer();
					o.read();
					o.display();
					break;
			case 2: System.out.println("1.REGULAR\n2.CASUAL\nENTER CHOICE : ");
					choice=sc.nextInt();
					if(choice==1) 
				    {
						Regular r= new Regular();
						r.read();
						r.display();
					}

					if(choice==2) 
				    {
						Casual c= new Casual();
						c.read();
						c.display();
					}break;

			default:System.out.println("INVALID CHOICE");	
		}
	}
}


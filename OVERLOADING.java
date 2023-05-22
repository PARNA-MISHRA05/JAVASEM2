import java.util.*;
class Student
{
	private String name;
	private int roll,math,phy,total;
	public Student()
	{
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NAME,ROLL NUMBER ,MATH ,PHY MARKS IN ORDER: ");
		name=sc.nextLine();
		roll=sc.nextInt();
		math=sc.nextInt();
		phy=sc.nextInt();
		total=math+phy;
	}
	boolean compare(Student s)
	{
		if(total<s.total)
			return true;
		else
			return false;
	}
	void display()
	{
		System.out.println(name+"\t"+roll+"\t"+math+"\t"+phy+"\t"+total);
	}
}
public class OVERLOADING
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF STUDENTS : ");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			s[i].accept();
			
		}
		Student temp=new Student();
		for(int i=0;i<n-1;i++)
		{
			
			for(int j=0;j<n-1;j++)
			{
				if(s[j].compare(s[j+1]))
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}	
		}
		System.out.println("NAME\tROLL\tMATH\tPHY\tTOTAL : ");
		for(int i=0;i<n;i++)
		{
			s[i].display();	
		}
	}
}

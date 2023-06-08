//WAP to implement three classes namely Student, Test and Result. Student class has member 
//as rollno, and read(). Test class has members as sem1_marks and sem2_marks and read(). 
//Result class has member as total. Create an interface named sports that has a member score (). 
//Derive Test class from Student and Result class has multiple inheritances from Test and Sports. 
//Total is formula based on sem1_marks, sem2_mark and score.

import java.util.*;
class Student
{
	protected int rollno;
	public void read()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER ROLL NUMBER : ");
		rollno=sc.nextInt();
	}
}
class Test extends Student
{
	protected int sem1_marks,sem2_marks;
	public void read()
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SEM 1 AND 2 MARKS  : ");
		sem1_marks=sc.nextInt();
		sem2_marks=sc.nextInt();
	}
}
interface Sports
{
	public void score();
}
class Result extends Test implements Sports
{
	private int score,total;
	public void score()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SCORE : ");
		score=sc.nextInt();
		total=sem1_marks+sem2_marks+score;
		System.out.println("TOTAL IS  : "+total);
	}
}

public class Exp8a
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.read();
		r.score();
	}
}
import java.util.*;
public class Methodoverload
{
	public static int Calc(int a, int b)
	{
		return (a+b);
	}
	public static int Calc(int a, int b, int c)
	{
		return (a+b+c);
	}
	public static void main(String args[])
	{
		Methodoverload obj= new Methodoverload();
		int sum1=obj.Calc(5,6);
		int sum2=obj.Calc(5,6,7);
		System.out.println("USING METHOD 1 + "+sum1+"\nUSING METHOD 2 : "+sum2);
	}
}

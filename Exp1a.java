import java.util.*;
public class Exp1a
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		if(num%2!=0)
			System.out.println("WEIRD ");
		else if(num%2==0 && (num>=2 && num<=5))
			System.out.println("NOT WEIRD ");
		else if(num%2==0 && (num>=6 && num<=20))
			System.out.println("WEIRD ");
		else if(num%2==0 && num>20)
			System.out.println("NOT WEIRD");
	}
}
	 
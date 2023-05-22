import java.util.*;
public class Palindrome2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE STRING : ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		char[] ch= new char[str.length()];
		char[] rev=new char[str.length()];
		ch=str.toCharArray();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			rev[n-i-1]=ch[i];

		}
		short check=0;
		for(int i=0;i<n;i++)
		{
			if(rev[i]!=ch[i]) check=0;
			else 
				check=1;
		}
		if(check==1) System.out.println("PALINDROME");
		else System.out.println("NOT PALINDROME");
	}
}



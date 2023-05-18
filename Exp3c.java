import java.util.*;
public class Exp3c
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("PARNA MISHRA D083 SAP: 60009220201 ");
		System.out.println("ENTER THE STRING : ");
		String s=sc.nextLine();
		
		int len=s.length();
		boolean ispalindrome=true;
		for(int i=0;i<len/2;i++)
		{
			
			if(s.charAt(i)!=s.charAt(len-1-i))
			{
				ispalindrome=	false;
				break;
			}
		}
		if(ispalindrome)
		{
			System.out.println("PALINDROME");
		}
		else 
		System.out.println("NOT A PALINDROME ");		
	}
}


import java.util.*;
public class Exp3a
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("PARNA MISHRA D083 SAP: 60009220201 ");
		System.out.println("ENTER THE STRING : ");
		String s=sc.nextLine();
		int upper=0;
		int lower=0;
		int blank=0;
		int digit=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upper++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower++;
			}		
			else if(Character.isDigit(ch))
			{
				digit++;
			}
			else if(Character.isWhitespace(ch))
			{
				blank++;
			}
		}
		System.out.println("NUMBER OF : ");
		System.out.println("UPPERCASE = "+upper+"\nLOWERCASE = "+lower+"\nDIGIT = "+digit+"\nWHITESPACE = "+blank);
	}
}


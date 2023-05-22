import java.util.*;
public class Titlecase
{
	public static void main(String args[])
	{
		String str1,str2,str;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE STRING : ");
		 str=sc.nextLine();
		str=str.toLowerCase();
		
		str1=str.substring(0,1);
		str=str.substring(1);
		
		str1=str1.toUpperCase();
		str=str1.concat(str);
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==' ')
			{
				str1=str.substring(0,i+1);
				str2=str.substring(i+2);
				str=str.substring(i+1,i+2);
				str=str.toUpperCase();
				str=str1.concat(str);
				str=str.concat(str2);
				
			}

		}
		System.out.println(str);
	}
}

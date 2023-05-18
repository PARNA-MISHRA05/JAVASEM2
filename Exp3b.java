import java.util.*;
public class Exp3b
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("PARNA MISHRA D083 SAP: 60009220201 ");
		System.out.println("ENTER THE STRING : ");
		String s=sc.nextLine();
		System.out.println("ENTER THE CHARACTER WHOSE FREQUENCY IS TO BE FOUND : ");
		char search=sc.nextLine().charAt(0);
		int freq=0;

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==search)
				freq++;
		}
		System.out.println("NUMBER OF OCCURENCE : "+freq);
		
	}
}


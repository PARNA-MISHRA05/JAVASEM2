//THREAD TO COUNT OCCURRENCE OF CHARACTERS IN THE STRING


import java.util.*;
class Count implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING : ");
		String str=sc.nextLine();
		str=str.toUpperCase();
		int[] ctr=new int[26];
		char[] ch=str.toCharArray();
		System.out.println("CHARACTER\tOCCURENCE: ");
		char c;
		for(int i=0;i<=25;i++)
		{
			ctr[i]=0;
			
			c=(char)(i+65);
			for(int j=0;j<str.length();j++)
			{
				if(c==ch[j])
				{
					ctr[i]+=1;		
				}
			}
		}
		for(int i=0;i<=25;i++)
		{
			char c1;
			c1=(char)(i+1+64);
			System.out.println(c1+"\t\t\t"+ctr[i]);
		}
	}
}
public class Stringcount
{
	public static void main(String args[])
	{
		Count c=new Count();
		Thread t=new Thread(c);
		t.start();
	}
}	
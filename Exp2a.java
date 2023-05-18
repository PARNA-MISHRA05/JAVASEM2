import java.util.*;
public class Exp2a
{
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER OF ELEMENTS : ");
			int n=sc.nextInt();
			int[] a=new int[n];
			int[] sum=new int[a.length];
			for(int i=0;i<n;i++)
			{
				System.out.println("ENTER A VALUE : ");
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int add=0;
				for(int j=0;j<n;j++)
				{
					if(i!=j)
					add+=a[j];
				}
				sum[i]=add;
			}
			System.out.println("NEW ARRAY IS :");
			for(int k : sum)
			{
				System.out.println(k);
			}	
		
	}
}


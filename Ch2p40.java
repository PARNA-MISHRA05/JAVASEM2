import java.util.*;
public class Ch2p40
{
 public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 System.out.println("ENTER THE NUMBER of terms : ");
 int ctr=sc.nextInt();
 int n=1;
 while(ctr>=1)
{
 	int count=0;
	for(int i=1;i<=n;i++)
	{ 
		if(n%i==0)
		count++;
	}
	if(count==2)
   	{
	 System.out.println(" " +n);
	ctr--;
	n++;
	}

	
}
}
}

		
	

import java.util.*;
public class Ch2p37
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int digit,sum=0;
		while(n!=0)
		{
 			digit=n%10;
			sum+=digit*digit*digit;
			n/=10;
		}
		System.out.println("SUM OF THE CUBES OF IS : "+sum);
	}
}
 
		

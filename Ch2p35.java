import java.util.*;
public class Ch2p35
{
 public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 System.out.println("ENTER THE NUMBER : ");
 int n=sc.nextInt();
 int rev=0,digit;
 while(n!=0)
 {
	digit=n%10;
	rev=rev*10+digit;
	n/=10;
 }
 System.out.println("REVERSE OF THE NUMBER IS : "+rev);
}
}

	
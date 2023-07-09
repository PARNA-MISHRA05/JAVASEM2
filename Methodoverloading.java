public class Methodoverloading
{
	
	public static long calc(int num)
	{
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static int calc(int num)
	{
		int digit,rev=0;
		while(num!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		return rev;
	}
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		long f=calc(num);
		int r=calc(num);
		System.out.println(f+"\t"+r);

	}
}
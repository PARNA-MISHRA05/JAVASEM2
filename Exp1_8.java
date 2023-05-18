class Exp1_8
{
	public static void main(String args[])
	{
		int z,a;
		int t=64;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			t+=i;
			a=t;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)a);
				a--;
			}

			System.out.println("");
		}

	}
}
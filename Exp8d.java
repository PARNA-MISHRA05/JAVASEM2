class Test
{
}
class Exp8d
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj=null;
		System.gc();
		System.out.println("DELETED ");
	}
}

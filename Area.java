
class Area
{
	private static int l,b,side;
	public Area()  //default
	{
	}
	public Area(int len,int br)
	{
		l=len;
		b=br;		
	}
	public Area(Area c)
	{
		side=c.l;
	}
	static double  Square()
	{
		return (side*side);
	}
	static double Rectangle()
	{
		return (l*b);
	}


	public static void main(String args[])
	{
		Area obj=new Area();
		Area obj1=new Area(5,2);
		Area obj2=new Area(obj1);
		System.out.println("THE AREA OF RECTANGLE IS : "+Rectangle());
		System.out.println("AREA OF SQUARE IS : "+Square());
	}
}



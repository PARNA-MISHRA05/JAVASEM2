import java.util.*;
public class Exp4a
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("PARNA MISHRA D083 SAP: 60009220201 ");
		Vector v= new Vector();
		for(int i=0;i<args.length;i++)
		{
			v.addElement(args[i]);
		}
		System.out.println("THE ENTERED ELEMENTS ARE : ");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(v.get(i));
		}
	}
}


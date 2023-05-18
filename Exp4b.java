import java.util.*;
public class Exp4b
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("PARNA MISHRA D083 SAP: 60009220201 ");
		Vector v= new Vector();
		System.out.println("ENTER THE VALUE OF n : ");
		int n=sc.nextInt();
		sc.nextLine();
		int j;
		String str;
		int i=0;
		while(i<n)
		{
			System.out.println("ENTER THE NAME : ");
			str=sc.nextLine();
			if (v.contains(str)) {
                System.out.println("NAME ALREADY EXISTS AND IS DELETED ");
                v.remove(str);
            } else {
                v.addElement(str);
                i++;
            }
		}
		System.out.println("THE ELEMENTS ARE : ");
		for(int k=0;k<v.size();k++)
		{	
			System.out.println(v.get(k));
		}
	}
}

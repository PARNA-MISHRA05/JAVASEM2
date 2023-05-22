import java.util.*;
public class ShoppingCart
{
	public static void main(String args[])
	{
		int choice=0;
		Scanner sc= new Scanner(System.in);
		Vector v = new Vector();
		String str;

		System.out.println("FPR ITEMS IN SHOPPING LIST: ");
		for(int i=0;i<5;i++)
		{	
			System.out.println("ENTER THE NAME OF ITEM : ");
			str=sc.nextLine();
			v.addElement(str);
		}
		while(choice!=4)
		{
		System.out.println("1.ADD ELEMENT\n2.DELETE ELEMENT\n3.DISPLAY\n4.EXIT\nENTER CHOICE: ");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{

			case 1: System.out.println("ENTER THE ELEMENT TO BE ADDED: ");
					str=sc.nextLine();
					v.addElement(str);break;
			case 2: System.out.println("ENTER THE ELEMENT TO BE REMOVED: ");
					str=sc.nextLine();
					v.removeElement(str);break;
			case 3: System.out.println("ELEMENTS ARE: ");
					for(int i=0;i<v.size();i++)
					{
						System.out.println(v.elementAt(i));
					}
					break;
			case 4: break;
			default: System.out.println("INVALID CHOICE : ");
		}
		}
	}
}		
import java.util.*;
public class Ch2p46
{
 public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
	System.out.println("1.ADDITION ");
	System.out.println("2.SUBTRACTION ");
	System.out.println("3.MULTIPLICATION ");
	System.out.println("4.DIVISION ");
	System.out.println("5.MODULUS ");
 	System.out.println("6.EXIT ");
	System.out.println("ENTER THE CHOICE: ");
	int ch=sc.nextInt();
    nb
	System.out.println("ENTER THE 2 NUMBERS: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
	
	switch(ch)
	{
		case 1: 
		
		System.out.println("ADDITION  IS "+(a+b));
		break;
		
		case 2:
		
		System.out.println("SUBTRACTION  IS "+(a-b));break;
 

		case 3:
		
		System.out.println("MULTIPLICATION IS "+(a*b));break;

 		case 4:
		
		System.out.println("DIVISION IS "+(a/b));break;

		case 5:
		
		System.out.println("MODULUS IS "+(a%b));break;
		case 6:
		System.exit(0);

		default:System.out.println("INVALID CHOICE ");
	}
 }
}



import java.util.*;
public class Arraybound
{
	public static void main(String args[])
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		
		try{
		
			
			System.out.println(a[6]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException aie){
		System.out.println("SIZE OF ARRAY IS LESS THAN VALUE TO BE ACCEPTED");
		}
	}
}
import java.util.*;
public class Jagged
{
 	public static void main(String args[])
	{
		int[][] jaggedArray= new int[5][];
		for(int i=0;i<jaggedArray.length;i++)
		{
			jaggedArray[i]=new int[i+1];
				for(int j=0;j<=i;j++)
				{
					jaggedArray[i][j]=j+1;
				}
		}
		for(int num[] : jaggedArray)
		{
			for(int k : num)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

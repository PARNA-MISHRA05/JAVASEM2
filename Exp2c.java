

import java.util.*;
public class Exp2c
{
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			int[][] s= new int[5][4];
			for(int i=0;i<5;i++)
			{
				System.out.println("DETAILS OF STUDENT "+(i+1));
				System.out.println("ENTER THE ROLL NUMBER,SUBJECT 1 MARKS, SUB 2 , SUB 3 MARKS IN ORDER : ");
				for(int j=0;j<4;j++)
				{
					
					s[i][j]=sc.nextInt();
				}
			}
			System.out.println("ROLL NO.\tSUBJECT#1\tSUBJECT#2\tSUBJECT#3");
			for(int i=0;i<5;i++)
			{
				int sum=0;
				for(int j=0;j<4;j++)
				{
					System.out.print(s[i][j]+"\t");
				}
				for(int j=1;j<4;j++)
				{
					sum+=s[i][j];
					System.out.print("\t"+sum);
				}
				System.out.println();
			}
	}
}


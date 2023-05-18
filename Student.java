import java.util.*;
public class Student 
{
	private int id,mathMarks,phyMarks,chemMarks;
	private String name;
	public Student(int id,String n,int m,int p,int c,int t)
	{
		IdNo=id;
		name=n;
		maths=m;
		phy=p;
		chem=c;
		total=t;
		
	} 
	public static void main(String args[])
	{
		int IdNo,phy,chem,maths,n,total;
		String name;
		Student s[];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Students:");
		n=sc.nextInt();
		
		s=new Student[n]; //to constuct array of objects to store record of n students

		System.out.println("Enter Records of "+n+" student");
		for(int i=0;i<s.length;i++)
		{
			
			System.out.println("Enter Record of "+(i+1)+" Student:");

			IdNo=sc.nextInt();
			System.out.println("Enter name of Student: ");
			name=sc.next();
			System.out.println("Enter Marks of (Maths, Physics,Chemestry): ");
			maths=sc.nextInt();
			phy=sc.nextInt();
			chem=sc.nextInt();
			total=phy+chem+maths;
			s[i]=new Student(IdNo,name,maths,phy,chem,total);
		}

		System.out.println("Recod of the Students as per Decending order of total marks: ");
		
		for(int i=0;i<s.length-1;i++) //number of passes
		{
			for(int j=0;j<s.length-1-i;j++) //number of adjustant record comparison
			{
				if(s[j].total < s[j+1].total) //if condition is true swap 1 record with another record
				{
					Student temp;
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}

			}			

		}
		// to display record	
		System.out.println("ID Number\tName\tMaths\tPhysics\tChemestry\tTotalMarks");	
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i].IdNo+"\t        "+s[i].name+"\t "+s[i].maths+"\t "+s[i].phy+"\t "+s[i].chem+"\t\t   "+s[i].total);
			System.out.println();
		}
		
		
	}

}


	
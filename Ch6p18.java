//DEMONSTRATE DYNAMIC MEMORY DISPATCH
class Parent
{
	public  void display(int a)
	{
		System.out.println("this is main class ,  value is : "+a);
	}
}
class Child extends Parent
{
	public  void display(int a)
	{
		
		System.out.println("this is child class ,  value is : "+a);
	}
}
public class Ch6p18
{
	public static void main(String args[])
	{
		Child c=new Child();
		Parent p=new Parent();
		Parent ref;
		System.out.println("ENTER A CHOICE \n1.PARENT\n2.CHILD\nENTER CHOICE : "):
		int choice=sc.nextInt();
		if(choice==1) ref=p;
		else 
			ref=c;
		ref.display(5);
		
	}
}
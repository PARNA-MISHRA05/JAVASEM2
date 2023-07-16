import java.util.*;

class Parent
{
    public void display()
    {
        System.out.println("in the parent class ");
    }
}
class Child extends Parent 
{
    public void display()
    {
        System.out.println("in the child class");
    }
    
}
public class refrence {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        Parent ref;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice 1 for parent and 2 for child");
        int ch=sc.nextInt();
        if(ch==1)
            ref=p;
        else ref=c;
        ref.display();
    }
}


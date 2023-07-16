class Student{
   
}
class Test extends Student
{
}

interface Sports
{
    public void display();
}
class Result extends Test implements Sports
{
    public void display()//same method as interface 
    {
        System.out.println("hello in result class");
    }
}
public class Multiple
{
    public static void main(String[] args) {
        Result c=new Result();
        c.display();

    }
}
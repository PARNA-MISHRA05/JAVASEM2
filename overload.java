



public class overload {
    public overload()
    {
        
        System.out.println("this is normal constructor");
    }
    public overload(int x)
    {
        System.out.println("the number entered is "+ x);
    }
    public static void main(String[] args) {
        overload a=new overload();
        overload b=new overload(5);
    }
}

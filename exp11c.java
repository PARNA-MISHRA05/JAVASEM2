import java.util.*;
class Input extends Thread 
{
    public void run()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NO. OF ELEMENTS :");
    int n=sc.nextInt();
    int[] fibo=new int[n];
    
    Fib f=new Fib(n,fibo);
    f.start();
    try{
        f.join();

    }
    catch(Exception e){
    
    }
    System.out.println("fibonnaci series is :");
    for(int i=0;i<n;i++)
    {
        System.out.println(fibo[i]+" ");
    }
    


    }


}
class Fib extends Thread
{
    int size;
    int[] arr;
    public Fib(int x,int[] a )
    {
        size=x;
        arr=a;
    }
    public void run()
    {
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<size;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];

        }
    }
}




public class exp11c {
    public static void main(String[] args) {
        Input i=new Input();
        i.start();
    }
}

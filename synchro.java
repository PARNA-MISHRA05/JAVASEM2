class Book extends Thread{
    int vacant=1,req;
    public Book(int x)
    {
        req=x;
    }
    public synchronized void run()
    {
        if(vacant>=req)
        {
            System.out.println(req+" ticket booked for "+Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
            vacant-=1;
        }
        else 
        {
            System.out.println("khatam ho gye tickets sorry "+Thread.currentThread().getName());
        }
    }
    
}
public class synchro {
    public static void main(String[] args) {
        Book b=new Book(1);
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        t1.setName("JAY");
        t2.setName("VIJAY");
        t1.start();
        t2.start();
    }
}

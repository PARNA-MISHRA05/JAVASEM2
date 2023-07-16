import java.util.Scanner;

class MonthException extends Exception
{
    public MonthException(String str)
    {
        System.out.println(str);
    }
}

public class month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month: ");
        try{
            int m=sc.nextInt();
            if(m<1 || m>12)
            throw new MonthException("INVALID MONTH NUMBER ");
            System.out.println("MONTH ENTERED IS "+m);
        }
        catch(MonthException me){}
    }
}

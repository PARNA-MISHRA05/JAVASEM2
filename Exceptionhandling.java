import java.io.*;

class MonthException extends Exception{
    public MonthException(String str)
    {
            System.out.println(str);

    }
}

class Exceptionhandling
{
    public static void main(String[] args) throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter month ");
        
        try {
        int month=Integer.parseInt(br.readLine());
        if(month<1 || month>12)
        throw new MonthException("INVALID MONTH NUMBER ");
        System.out.println(month);
        } catch (MonthException e) {}
    }
    
}
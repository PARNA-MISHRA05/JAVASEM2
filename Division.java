import java.io.*;
public class Division {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBERS TO BE DIVIDED : ");
        try{
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            System.out.println(n1/n2);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("cant divide with 0");
        }
    }
}

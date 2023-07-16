import java.util.*;
public class vector1 {
    public static void main(String[] args) {
        Vector v=new Vector(5);
        for(int i=0;i<=2;i++)
        {
            v.add(Integer.parseInt(args[i]));
        }
        System.out.println("displaying the vector");
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }
    }
}

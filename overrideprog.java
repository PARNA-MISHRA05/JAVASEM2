import java.util.*;

class Bookname {
    Scanner sc = new Scanner(System.in);
    protected String bname;

    public void input() {
        System.out.println("ENTER BOOK NAME:");
        bname = sc.nextLine();
    }
}

class Author extends Bookname {
    private String aname;
    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        super.input();
        System.out.println("ENTER AUTHOR NAME:");
        aname = sc.nextLine();
    }
}

public class overrideprog {
    public static void main(String[] args) {
        Author a = new Author();
        a.input();
    }
}

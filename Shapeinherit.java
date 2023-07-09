import java.util.Scanner;

class Shape {
    protected double area; // Added area variable

    public void calcArea() {
        // Implemented in the child classes
    }
}

class Circle extends Shape {
    private int radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS: ");
        radius = sc.nextInt();
    }

    @Override
    public void calcArea() {
        area = radius * radius * 3.14;
        System.out.println("AREA IS: " + area);
    }
}

class Square extends Shape {
    private int side;

    public Square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIDE LENGTH: ");
        side = sc.nextInt();
    }

    @Override
    public void calcArea() {
        area = side * side;
        System.out.println("AREA IS: " + area);
    }
}

public class Shapeinherit {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        circle.calcArea();
        square.calcArea();
    }
}

import java.util.Scanner;
class Shape
{
    float area;
    void showArea()
    {;}
}

class Circle extends Shape
{
    void showArea()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter radius:");
        int r = scanner.nextInt();
        area=3.14f*r*r;
        System.out.println("The area of circle:"+area);
    }
}
class Rect extends Shape
{
    void showArea()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter length:");
        int l = scanner.nextInt();
        System.out.print("Enter breadth:");
        int b = scanner.nextInt();
        area=l*b;
        System.out.println("The area of rectangle:"+area);
    }
}

class Main
{
    public static void main(String args[])
    {
        Circle c = new Circle();
        Rect r = new Rect();
        r.showArea();
        c.showArea();
    }
}
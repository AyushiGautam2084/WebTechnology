import java.util.Scanner;
class TwoD
{
    int a;
    int area()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side:");
        int s = scanner.nextInt();
        a = s*s;
        System.out.println("The area of 2D sheet is "+a);
        System.out.println("The price of 2D sheet:"+(a*40));
        scanner.close();
        return a;
    }
}

class ThreeD extends TwoD
{
    int ar;
    int area()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side:");
        int s = scanner.nextInt();
        ar=6*s*s;
        System.out.println("The area of 3D box is "+ar);
        System.out.println("The price of 3D box:"+(ar*60));
        scanner.close();
        return 0;
    }
}

class Main
{
    public static void main(String args[])
    {
        TwoD twd = new TwoD();
        ThreeD td = new ThreeD();
        twd.area();
        td.area();
    }
}
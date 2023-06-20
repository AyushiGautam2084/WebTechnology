import java.io.*;
class Main
{
    public static void main(String[] arr) throws IOException
    {
        DataInputStream ds = new DataInputStream(System.in);
        System.out.print("Area of 1. Circle\n2.Triangle\n3.Square?");
        int choice = Integer.parseInt(ds.readLine());
        switch(choice)
        {
            case 1:
            float r;
            System.out.print("Enter radius:");
            r = Float.parseFloat(ds.readLine());
            System.out.print("\nArea of circle:"+(r*r*3.14f));
            break;
            case 2:
            float h,b;
            System.out.print("Enter height:");
            h = Float.parseFloat(ds.readLine());
            System.out.print("Enter base:");
            b = Float.parseFloat(ds.readLine());
            System.out.print("\nArea of triangle:"+(h*b*0.5f));
            break;
            case 3:
            int a;
            System.out.print("Enter side:");
            a= Integer.parseInt(ds.readLine());
            System.out.print("\nArea of sqaure:"+(a*a));
            break;
        }
    }
}


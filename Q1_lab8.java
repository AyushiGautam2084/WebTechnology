import java.util.Scanner;

abstract class Student
{
    int roll_no;
    int reg_no;
    abstract void course();
}

class Kiitian extends Student
{
    void course()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll:");
        roll_no = sc.nextInt();
        System.out.println("Enter registeration number:");
        reg_no  = sc.nextInt();
        System.out.println("Roll number:"+roll_no);
        System.out.println("Registeration number:"+reg_no);
        sc.close();
    }
}
class Main
{
    public static void main(String[] args)
    {
        Kiitian KT = new Kiitian();
        KT.course();
    
    }
}
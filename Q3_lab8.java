import java.util.Scanner;

interface money
{
    public void earnings(int basic);
    public void deductions(int basic);
    public void bonus(int basic);
}

class Manager implements money
{
    public void earnings(int basic)
    {
        int DA = (8*basic)/10;
	    int HRA = (15*basic)/100;
	    System.out.println("The earnings are => basic = " + basic + " DA = " + DA + " HRA = " + HRA);
	    System.out.println("And the total earning is = " + (basic+DA+HRA));
    }
    public void deductions(int basic)
    {
        int deduction = (12*basic)/100;
	    System.out.println("The deductionPF is = " + deduction);
    }
    public void bonus(int basic) {}
}
class Substaff extends Manager 
{
    public void bonus(int basic)
    {
        int bonus = (1*basic)/2;
	    System.out.println("The bonus is = " + bonus);
    }
    public static void main(String args[])
    {
        System.out.print("Please enter basic salary = ");
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        Substaff s = new Substaff();
        s.earnings(basic);
        s.deductions(basic);
        s.bonus(basic);
    }
}
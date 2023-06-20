// Sales.java
package Marketing;
import General.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        double totalEarnings = earnings();
        double tallowance = 0.05 * totalEarnings;
        return tallowance;
    }
}

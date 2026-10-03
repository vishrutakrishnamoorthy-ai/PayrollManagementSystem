package model;

/**
 * Full-time employee paid a fixed monthly salary.
 */
public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, String department, double monthlySalary) {
        super(employeeId, name, department);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateGrossPay() {
        return monthlySalary;
    }

    @Override
    public String getEmployeeType() {
        return "Full-Time";
    }
}
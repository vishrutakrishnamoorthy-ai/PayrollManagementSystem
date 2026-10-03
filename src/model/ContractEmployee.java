package model;

/**
 * Contract employee paid a fixed contract amount.
 */
public class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(int employeeId, String name, String department, double contractAmount) {
        super(employeeId, name, department);
        this.contractAmount = contractAmount;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateGrossPay() {
        return contractAmount;
    }

    @Override
    public String getEmployeeType() {
        return "Contract";
    }
}
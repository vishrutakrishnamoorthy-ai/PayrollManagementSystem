package model;

/**
 * Abstract base class for all employees.
 * Demonstrates Abstraction and Encapsulation.
 */
public abstract class Employee {
    private final int employeeId;
    private String name;
    private String department;

    public Employee(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    // ========== Encapsulation ==========
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Abstract method – forces every subclass to provide its own
     * gross-pay calculation. This is the key polymorphic method.
     */
    public abstract double calculateGrossPay();

    /**
     * Returns a human-readable employee type (used for display).
     */
    public abstract String getEmployeeType();

    @Override
    public String toString() {
        return String.format("ID: %-5d | Name: %-15s | Dept: %-12s | Type: %s",
                employeeId, name, department, getEmployeeType());
    }
}
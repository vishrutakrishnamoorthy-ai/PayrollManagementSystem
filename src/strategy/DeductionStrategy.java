package strategy;

/**
 * Strategy interface for tax / deduction algorithms.
 * This is the core of the Strategy Design Pattern.
 */
public interface DeductionStrategy {
    /**
     * Calculates the deduction amount based on the given gross pay.
     * @param grossPay the employee's gross pay
     * @return the deduction amount (never negative)
     */
    double calculateDeduction(double grossPay);
}
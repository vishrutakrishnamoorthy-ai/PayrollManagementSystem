package strategy;

/**
 * Concrete strategy: no deduction is applied.
 */
public class NoDeductionStrategy implements DeductionStrategy {
    @Override
    public double calculateDeduction(double grossPay) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "No Deduction";
    }
}
package exception;

/**
 * Custom exception used for all employee-related validation failures.
 */
public class InvalidEmployeeDataException extends Exception {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }
}
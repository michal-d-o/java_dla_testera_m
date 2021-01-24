package exceptions;

public class IllegalBugPriorityException extends RuntimeException {

    public IllegalBugPriorityException() {
    }

    public IllegalBugPriorityException(String message) {
        super(message);
    }
}

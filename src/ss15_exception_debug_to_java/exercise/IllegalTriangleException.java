package ss15_exception_debug_to_java.exercise;

public class IllegalTriangleException extends Throwable {
    public IllegalTriangleException(String messenger) {
        super(messenger);
    }
}

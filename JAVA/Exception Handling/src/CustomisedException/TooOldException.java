package CustomisedException;

public class TooOldException extends RuntimeException {
    public TooOldException(String message) {
        super(message);
    }
}

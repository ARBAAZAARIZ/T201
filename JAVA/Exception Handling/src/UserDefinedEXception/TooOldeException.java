package UserDefinedEXception;
// unchecked exception
public class TooOldeException extends RuntimeException{
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public TooOldeException(String msg) {
        super(msg);
    }
}

package vlas.util;

public class BicycleException extends RuntimeException {
    public BicycleException(String message) {
        super(message);
    }
    public BicycleException() {
        super();
    }
    public BicycleException(String message, Throwable cause) {
        super(message, cause);
    }
    public BicycleException(Throwable cause) {
        super(cause);
    }
    protected BicycleException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public String getMessage() {
        return super.getMessage();
    }
}

package vlas.util;

public class WheelsException extends BicycleException {
    public String getMessage() {
        return super.getMessage();
    }

    public WheelsException(String message) {
       super(message);
    }

    public WheelsException() {
        super();
    }
    public WheelsException(String message, Throwable cause) {
        super(message, cause);
    }
    public WheelsException(Throwable cause) {
        super(cause);
    }
    protected WheelsException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

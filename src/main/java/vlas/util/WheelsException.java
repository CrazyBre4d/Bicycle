package vlas.util;

public class WheelsException extends BicycleException {

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public WheelsException(String message) {
       super(message);
    }
}

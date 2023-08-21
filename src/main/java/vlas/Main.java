package vlas;

import vlas.util.Bicycle;
import vlas.util.Frame;
import vlas.util.Wheel;
import vlas.util.WheelsException;

public class Main {
    public static void main(String[] args) {
    try {
        Bicycle bicycle = null;
        Wheel[] defaultWheels = null;
        Frame frame = new Frame("aluminium","blue", 2);

        bicycle = new Bicycle(defaultWheels, frame, "sportBike");

        Wheel wheel_1 = new Wheel("oval",3);
        Wheel wheel_2 = new Wheel("square",5);
        Wheel wheel_3 = new Wheel("square",2);
        Wheel[] wheels = new Wheel[]{wheel_1,wheel_2,wheel_3};
        bicycle.setWheels(wheels);

        System.out.println(bicycle);
    }
     catch (WheelsException e) {
        System.out.println(e.getMessage());
    }
    }
}

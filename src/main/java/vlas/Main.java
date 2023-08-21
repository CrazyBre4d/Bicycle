package vlas;

import vlas.util.Bicycle;
import vlas.util.Frame;
import vlas.util.Wheel;
import vlas.util.WheelsException;

public class Main {
    public static void main(String[] args) {
    try {
        Bicycle bicycle = null;
        Wheel[] wheels = null;
        Frame frame = new Frame("aluminium","blue", 2);

        bicycle = new Bicycle(wheels, frame, "sportBike");

        Wheel wheel1 = new Wheel("oval",3);
        Wheel wheel2 = new Wheel("square",5);
        Wheel wheel3 = new Wheel("square",8);
        Wheel[] wheels1 = new Wheel[]{wheel1,wheel2,wheel3};
        bicycle.setWheels(wheels1);

        System.out.println(bicycle);
    }
     catch (WheelsException e) {
        System.out.println(e.getMessage());
    }
    }
}

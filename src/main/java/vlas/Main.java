package vlas;

import vlas.entity.Bicycle;
import vlas.entity.Frame;
import vlas.entity.Wheel;
import vlas.util.WheelsException;

public class Main {
    public static void main(String[] args) {
    try {

        Wheel wheel_1 = new Wheel("oval",3);
        Wheel wheel_2 = new Wheel("square",3);
        Wheel wheel_3 = new Wheel("square",3);
        Frame frame = new Frame("aluminium","blue", 2);

        Bicycle bicycle = new Bicycle(new Wheel[]{wheel_1,wheel_2}, frame, "sportBike");
        bicycle.ride();
        bicycle.breakMe();

        System.out.println(bicycle);
    }
     catch (WheelsException e) {
        System.out.println(e.getMessage());
    }
    }
}

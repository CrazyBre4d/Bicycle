package vlas;

import vlas.entity.Bicycle;
import vlas.entity.Frame;
import vlas.entity.Wheel;
import vlas.util.WheelsException;

public class Main {
    public static void main(String[] args) {
    try {
        Wheel wheel1 = new Wheel("square",-3);
        Wheel wheel2 = new Wheel("oval",-3);
        Wheel wheel3 = new Wheel("square",3);
        Frame frame = new Frame("aluminium","blue", 2);

        Bicycle bicycle = new Bicycle(new Wheel[]{wheel1,wheel2}, frame, "sportBike");
        bicycle.ride();
        //bicycle.breakMe();
        bicycle.what();

        System.out.println(bicycle);
    }
     catch (WheelsException  | IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    }
}

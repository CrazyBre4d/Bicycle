package vlas;

import vlas.util.Bicycle;
import vlas.util.Frame;
import vlas.util.Wheel;

public class Main {
    public static void main(String[] args) {
    try {
        Wheel wheel1 = new Wheel("oval",3);
        Wheel wheel2 = new Wheel("square",5);
        Wheel[] wheels = new Wheel[]{wheel1,wheel2};
        Frame frame = new Frame("aluminium","blue", 2);

       if (wheels.length > frame.getHoles_for_wheels()) {
           throw new IllegalArgumentException("Need more holes!");
       }
       if (wheels.length < frame.getHoles_for_wheels()) {
            throw new IllegalArgumentException("Need more wheels!");
       }

        Bicycle b = new Bicycle(wheels, frame, "sportBike");

        System.out.println(b);
    }
    catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }
    }
}

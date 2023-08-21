package vlas.util;

import java.util.Arrays;
import java.util.Objects;

public class Bicycle {
     private Wheel[] wheels;
     private Frame frame;
     private String type;

     public Bicycle(Wheel[] wheels, Frame frame, String type) throws WheelsException {
          this.frame = frame;
          this.type = type;
          setWheels(wheels);
     }
     public Bicycle(){}

     public Wheel[] getWheels() {
          return wheels;
     }

     public Frame getFrame() {
          return frame;
     }

     public String getType() {
          return type;
     }

     public void setFrame(Frame frame) {
          this.frame = frame;
     }

     public void setType(String type) {
          this.type = type;
     }

     public void setWheels (Wheel[] wheels) throws WheelsException {
          this.wheels = wheels;
          if (wheels.length != frame.getHolesForWheels()) {
               throw new WheelsException("The number of wheels does not match the number of holes!");
          }
          }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Bicycle bicycle = (Bicycle) o;
          return Objects.equals(wheels, bicycle.wheels) && Objects.equals(frame, bicycle.frame) && Objects.equals(type, bicycle.type);
     }

     @Override
     public int hashCode() {
          return Objects.hash(wheels, frame, type);
     }

     @Override
     public String toString() {
          return "Bicycle{" +
                  "wheels=" + Arrays.toString(wheels) +
                  ", frame=" + frame +
                  ", type='" + type + '\'' +
                  '}';
     }
}

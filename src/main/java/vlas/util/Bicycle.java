package vlas.util;

import java.util.Objects;

public class Bicycle {
     private Wheels wheels;
     private Frame frame;
     private String type;

     public Bicycle(Wheels wheels, Frame frame, String type){
          this.wheels = wheels;
          this.frame = frame;
          this.type = type;
     }

     public Wheels getWheels() {
          return wheels;
     }

     public void setWheels(Wheels wheels) {
          this.wheels = wheels;
     }

     public Frame getFrame() {
          return frame;
     }

     public void setFrame(Frame frame) {
          this.frame = frame;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
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
                  "wheels=" + wheels +
                  ", frame=" + frame +
                  ", type='" + type + '\'' +
                  '}';
     }
}

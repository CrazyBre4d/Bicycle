package vlas.entity;

import vlas.util.WheelsException;

import java.util.Arrays;
import java.util.Objects;

public class Bicycle {
     private Wheel[] wheels;
     private Frame frame;
     private String type;

     public Bicycle(Wheel[] wheels, Frame frame, String type) {
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

     public void ride() {
          int expectedDiameter = wheels[0].getDiameter();

          for (Wheel wheel : wheels) {
               if (wheel.getDiameter() != expectedDiameter | wheel.getDiameter()<0 ) {
                    throw new WheelsException("All wheels must have the same diameter!\n Or diameter must be above zero!");
               }
          }
          System.out.println("ПО ПОЛЯМ \nПО ПОЛЯМ\nСИНИЙ ТРАКТОР ЕДЕТ К НАМ ( велосипед едет )");
     }
     public void breakMe() {
          if (wheels != null) {
               Arrays.fill(wheels, null);
          }
     }

     public void setWheels (Wheel[] wheels) {
          for (Wheel wheel : wheels) {
               if (wheel == null) {
                    throw new IllegalArgumentException("Wheel cannot be null");
               }
          }
          if (wheels == null || wheels.length == 0) {
               throw new IllegalArgumentException("Wheels array cannot be null or empty");
          }

          if (wheels.length != frame.getHolesForWheels()) {
               throw new WheelsException("The number of wheels does not match the number of holes!");
          }
          this.wheels = wheels;
          }
          public void what() {
          if(wheels.length < 1) {
               throw new WheelsException("The number of wheels cannot be less than zero");
          }
               System.out.print("Bike type: ");
          switch (wheels.length) {
               case 1: System.out.println("Monowheel"); break;
               case 2: System.out.println("Usual bike"); break;
               case 3: System.out.println("Tricycle"); break;
               default: System.out.println("Multiwheeled"); break;
                }
          }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Bicycle bicycle = (Bicycle) o;
          return Arrays.equals(wheels, bicycle.wheels) && Objects.equals(frame, bicycle.frame) && Objects.equals(type, bicycle.type);
     }

     @Override
     public int hashCode() {
          return Objects.hash(Arrays.hashCode(wheels), frame, type);
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

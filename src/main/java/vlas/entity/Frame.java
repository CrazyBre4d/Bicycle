package vlas.entity;

import java.util.Objects;

public class Frame {
    private String material;
    private String color;
    private int holesForWheels;

    public Frame(String material, String color, int holesForWheels) {
        this.material = material;
        this.color = color;
        this.holesForWheels = holesForWheels;
    }
    public Frame(){}

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHolesForWheels() {
        return holesForWheels;
    }

    public void setHolesForWheels(int holes_for_wheels) {
        this.holesForWheels = holes_for_wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return holesForWheels == frame.holesForWheels && Objects.equals(material, frame.material) && Objects.equals(color, frame.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color, holesForWheels);
    }

    @Override
    public String toString() {
        return "Frame{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", holes_for_wheels=" + holesForWheels +
                '}';
    }
}

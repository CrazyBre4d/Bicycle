package vlas.util;

import java.util.Objects;

public class Frame {
    private String material;
    private String color;
    private int holes_for_wheels;

    public Frame(String material, String color, int holes_for_wheels) {
        this.material = material;
        this.color = color;
        this.holes_for_wheels = holes_for_wheels;
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
        return holes_for_wheels;
    }

    public void setHolesForWheels(int holes_for_wheels) {
        this.holes_for_wheels = holes_for_wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return holes_for_wheels == frame.holes_for_wheels && Objects.equals(material, frame.material) && Objects.equals(color, frame.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color, holes_for_wheels);
    }

    @Override
    public String toString() {
        return "Frame{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", holes_for_wheels=" + holes_for_wheels +
                '}';
    }
}

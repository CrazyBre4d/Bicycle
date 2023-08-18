package vlas.util;

import java.util.Objects;

public class Frame {
    private String material;
    private String color;

    public Frame(String material, String color) {
        this.material = material;
        this.color = color;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return Objects.equals(material, frame.material) && Objects.equals(color, frame.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color);
    }

    @Override
    public String toString() {
        return "Frame{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

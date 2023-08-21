package vlas.util;

import java.util.Objects;

public class Wheel{
    private String form;
    private int diameter;


    public Wheel(String form, int diameter) {
        this.form = form;
        this.diameter = diameter;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheels = (Wheel) o;
        return diameter == wheels.diameter && Objects.equals(form, wheels.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(form, diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "form='" + form + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}

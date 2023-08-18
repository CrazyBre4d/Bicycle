package vlas.util;

import java.util.Objects;

public class Wheels {
    private String form;
    private int amount;

    public Wheels(String form, int amount) {
        this.form = form;
        this.amount = amount;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheels wheels = (Wheels) o;
        return amount == wheels.amount && Objects.equals(form, wheels.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(form, amount);
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "form='" + form + '\'' +
                ", amount=" + amount +
                '}';
    }
}

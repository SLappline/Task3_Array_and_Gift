package org.example.sweets;

public class Waffles extends Gift{
    private String form;

    public Waffles(String name, int weight, Double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Waffles [" + super.toString() + ", form = " + form;
    }
}

package org.example.sweets;

public class Kinder extends Gift{
    private String toy;

    public Kinder(String name, int weight, Double price, String gender) {
        super(name, weight, price);
        this.toy = gender;
    }

    public String getGender() {
        return toy;
    }

    public void setGender(String gender) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Kinder [" + super.toString() + ", toy = " + toy;
    }
}


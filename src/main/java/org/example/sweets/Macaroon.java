package org.example.sweets;

public class Macaroon extends Gift{
    private String filling;

    public Macaroon(String name, int weight, Double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Macaroon [" + super.toString() + ", filling = " + filling;
    }
}

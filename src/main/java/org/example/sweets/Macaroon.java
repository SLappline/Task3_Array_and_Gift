package org.example.sweets;

public class Macaroon extends Gift{

    public Macaroon(int id, String name, int weight, Double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Macaroon [" + super.toString();
    }
}

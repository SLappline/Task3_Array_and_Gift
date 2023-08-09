package org.example.sweets;

public class Waffles extends Gift{

    public Waffles(int id, String name, int weight, Double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Waffles [" + super.toString();
    }
}

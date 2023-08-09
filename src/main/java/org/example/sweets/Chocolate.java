package org.example.sweets;

public class Chocolate extends Gift{

    public Chocolate(int id, String name, int weight, Double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString();
    }

}

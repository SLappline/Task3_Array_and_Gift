package org.example.sweets;

public class Candy extends Gift{
    public Candy(String name, int weight, Double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString();
    }
}

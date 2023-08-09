package org.example.sweets;

public class Jellybean extends Gift{
    public Jellybean(int id, String name, int weight, Double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString();
    }
}

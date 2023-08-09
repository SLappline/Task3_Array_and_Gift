package org.example.sweets;

public class Kinder extends Gift{

    public Kinder(int id, String name, int weight, Double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Kinder [" + super.toString();
    }
}


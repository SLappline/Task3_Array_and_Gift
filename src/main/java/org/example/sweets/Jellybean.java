package org.example.sweets;

public class Jellybean extends Gift{
    private String hardness;
    public Jellybean(String name, int weight, Double price, String hardness) {
        super(name, weight, price);
        this.hardness = hardness;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", hardness = " + hardness;
    }
}

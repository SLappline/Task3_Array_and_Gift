package org.example.sweets;

public class Candy extends Gift{
    private String taste;
    public Candy(String name, int weight, Double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", taste = " + taste;
    }
}

package org.example.sweets;

public class Chocolate extends Gift{
    private String country;

    public Chocolate(String name, int weight, Double price, String country) {
        super(name, weight, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", country = " + country;
    }

}

package org.example.sweets;

public class Gift {
    private static int id = 0;
    public String name;
    public int weight;
    public Double price;
    public Gift() {};

    public Gift(String name, int weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    public static int setId(int id) {
        id++;
        Gift.id = id;
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + ", weight = " + weight + ", price = " + price;
    }
}

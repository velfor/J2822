package Serialize;

import java.io.Serializable;
import java.util.Objects;

public class Fish implements Serializable
{
    private String name;
    private double weight;
    private double price;

    Fish(){}

    public Fish(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;
        Fish fish = (Fish) o;
        return Double.compare(fish.getWeight(), getWeight()) == 0 &&
                Double.compare(fish.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), fish.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), getPrice());
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}


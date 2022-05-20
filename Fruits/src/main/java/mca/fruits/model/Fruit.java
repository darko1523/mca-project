package mca.fruits.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Fruit {
    private String name;
    private Boolean domestic;
    private Double price;
    private String weight;
    private String description;

    public Fruit(String name, Boolean domestic, Double price, String weight, String description) {
        this.name = name;
        this.domestic = domestic;
        this.price = price;
        this.weight = weight;
        description = description.substring(0, Math.min(description.length(), 10));
        this.description = description;
    }

    public Fruit(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDomestic() {
        return domestic;
    }

    public void setDomestic(Boolean domestic) {
        this.domestic = domestic;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Fruits  {" +
                "domestic='" + domestic + '\'' +
                ", name=" + name +
                ", price=" + price +
                ", weight=" + weight +
                ", description='" + description + "..." +
                '}';
    }
}

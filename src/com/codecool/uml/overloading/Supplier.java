package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id;
    private static int counter = 1;
    private String name;
    private String description;

    public Supplier() {
        this.id = counter++;
    }

    public Supplier(String name, String description) {
        this.id = counter++;
        setName(name);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:" + this.getId() +
                ",name:" + this.getName() +
                ",description:" + this.getDescription());
        return sb.toString();
    }
}

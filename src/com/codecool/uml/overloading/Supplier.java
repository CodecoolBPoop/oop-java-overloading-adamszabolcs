package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id;
    private static String name;
    private String description;

    public Supplier() {
        this.id = id++;
    }

    public Supplier(String name, String description) {
        this.id = id++;
        setName(name);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public static String getName() {
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

    public static List<Product> getProducts() {
        String name = getName();
        return Product.getAllProductsBy(name);
    }

    public String toString() {
        //TODO
    }
}

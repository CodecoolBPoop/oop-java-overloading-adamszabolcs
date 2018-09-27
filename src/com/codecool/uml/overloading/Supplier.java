package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id;
    private String name;
    private String description;

    public Supplier() {
        //TODO
    }

    public Supplier(String name, String description) {
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

    public static List<Product> getProducts() {
        //TODO
    }

    public String toString() {
        //TODO
    }
}

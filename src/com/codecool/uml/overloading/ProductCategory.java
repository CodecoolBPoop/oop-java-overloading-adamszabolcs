package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {

    private int id;
    private static String name;
    private String department;
    private String description;

    public ProductCategory() {
        this.id = id++;
    }

    public ProductCategory(String name, String department, String description) {
        this.id = id++;
        setName(name);
        setDepartment(department);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static List<Product> getProducts() {
/*
        String name = getName();
        return Product.getAllProductsBy(name);
*/
        return null;
    }

    public String toString() {
        //TODO
        return "";
    }
}

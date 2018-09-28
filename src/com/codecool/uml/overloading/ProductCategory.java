package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {

    private int id;
    private static int counter = 1;
    private static String name;
    private String department;
    private String description;

    public ProductCategory() {
        this.id = counter++;
    }

    public ProductCategory(String name, String department, String description) {
        this.id = counter++;
        setName(name);
        setDepartment(department);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public String getName() {
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

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:" + this.getId() +
                ",name:" + this.getName() +
                ",department:" + this.getDepartment() +
                ",description:" + this.getDescription());
        return sb.toString();

    }
}

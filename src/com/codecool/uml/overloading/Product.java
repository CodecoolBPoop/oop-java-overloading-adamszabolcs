package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {
    private static int counter = 1;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    public Product() {
        this.id = counter++;
        productList.add(this);
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = counter++;
        setName(name);
        setDefaultPrice(defaultPrice);
        setDefaultCurrency(defaultCurrency);
        productList.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductCategory() == productCategory) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsBySupplier = new ArrayList<>();
        for (Product product : productList) {
            if (product.supplier == supplier) {
                productsBySupplier.add(product);
            }
        }
        return productsBySupplier;
    }

    public String toString() {
        /*StringBuilder sb = new StringBuilder();
        sb.append(*/
        return "id:" + this.getId() +
                ",name:" + this.getName() +
                ",defaultprice:" + this.getDefaultPrice() +
                ",supplier:" + this.supplier.getName() +
                ",category:" + this.productCategory.getName() +
                ",defaultcurrency:" + this.getDefaultCurrency();
/*
        return sb.toString();
*/
    }
}

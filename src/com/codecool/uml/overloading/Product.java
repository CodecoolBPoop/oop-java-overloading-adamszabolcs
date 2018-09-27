package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList;

    public Product() {
        this.id = id++;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = id++;
        setName(name);
        setDefaultPrice(defaultPrice);
        setDefaultCurrency(defaultCurrency);
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
            if (product.getSupplier() == supplier) {
                productsBySupplier.add(product);
            }
        }
        return productsBySupplier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : productList) {
            sb.append("id:" + product.getId() +
                    ",name:" + product.getName() +
                    ",defaultprice:" + product.getDefaultPrice() +
                    ",supplier:" + product.getSupplier() +
                    ",category:" + product.getProductCategory() +
                    ",defaultcurrency:" + product.getDefaultCurrency());
        }
        return sb.toString();
    }
}

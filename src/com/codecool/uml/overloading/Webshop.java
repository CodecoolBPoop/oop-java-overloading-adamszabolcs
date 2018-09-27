package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Locale;

public class Webshop {

    public static void main(String[] args) {
        ProductCategory electronics = new ProductCategory("DVD players", "Electronics", "Just the best");
        Supplier Toshiba = new Supplier("Toshiba", "The best ever");
	    Product dvd = new Product("dvdplayer", 4500.0f, Currency.getInstance("HUF"));
        dvd.setProductCategory(electronics);
        dvd.setSupplier(Toshiba);
        System.out.println(dvd.getId());
        System.out.println(dvd.getName());
        System.out.println(dvd.getProductCategory().getName());
        System.out.println(dvd.getSupplier().getName());
        System.out.println(dvd.getDefaultCurrency());
        System.out.println(dvd.getDefaultPrice());
        Product ball = new Product();
        System.out.println(ball.getId());
    }
}

package com.codecool.uml.overloading;

import java.time.Instant;
import java.util.Currency;
import java.util.Date;

public class Webshop {

    public static void main(String[] args) {
        ProductCategory electronics = new ProductCategory("DVD players", "Electronics", "Just the best");
        Supplier toshiba = new Supplier("Toshiba", "The best ever");
	    Product dvd = new Product("dvdplayer", 4500.0f, Currency.getInstance("HUF"));
        dvd.setProductCategory(electronics);
        dvd.setSupplier(toshiba);
        Product ball = new Product("Ball", 270.0f, Currency.getInstance("HUF"));
        Supplier tarmak = new Supplier();
        tarmak.setName("Tarmak");
        tarmak.setDescription("Second best ever");
        ball.setSupplier(tarmak);
        ball.setProductCategory(electronics);
        ball.setName("Not ball");
        ball.setDefaultCurrency(Currency.getInstance("GBP"));
        ball.setDefaultPrice(8500.0f);
        ProductCategory balls = new ProductCategory();
        balls.setName("Balls");
        balls.setDepartment("Not electronics");
        balls.setDescription("For real. They're balls.");
        Product reallyBall = new Product();
        reallyBall.setDefaultPrice(100.0f);
        reallyBall.setDefaultCurrency(Currency.getInstance("HUF"));
        reallyBall.setName("NAME");
        reallyBall.setProductCategory(balls);
        reallyBall.setSupplier(tarmak);
        System.out.println(balls.toString());
        System.out.println(balls.getProducts());
        System.out.println(reallyBall.toString());
        FeaturedProductCategory featured = new FeaturedProductCategory();
        featured.schedule(Date.from(Instant.now().minusSeconds(2500)), Date.from(Instant.now()));
        System.out.println(featured.toString());


    }
}

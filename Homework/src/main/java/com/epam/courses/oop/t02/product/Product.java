package com.epam.courses.oop.t02.product;

import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 17.01.2017.
 */

@EqualsAndHashCode(exclude = {"amount", "price"})
public abstract class Product {

    private int amount;
    private double price;
    private String name;

    public Product(double price, String name){
        this.price = price;
        this.name = name;
    }

    public Product(double price, String name, int amount){
        this(price, name);
        this.amount = amount;
    }

    public int getAmount() {
        return moreThanZero(this.amount) ? amount : 0;
    }

    public int setAmount(int amount) {
        this.amount = moreThanZero(amount) ?
                amount : 0;
        return this.amount;
    }

    public double getPrice() {
        return moreThanZero((int)this.price) ? price : 0;
    }

    public double getTotalPrice() {
        return getAmount()*getPrice();
    }

    public String getName() {
        return name;
    }

    protected boolean moreThanZero(int n){
        return n>0;
    }

    public String toString(){
        return getClass().getSimpleName();
    }
}

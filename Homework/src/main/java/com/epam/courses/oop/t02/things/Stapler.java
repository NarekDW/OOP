package com.epam.courses.oop.t02.things;

import com.epam.courses.oop.t02.product.Product;

/**
 * Created by Narek on 17.01.2017.
 */
public class Stapler extends Product {
    private double version;

    public Stapler(double price, String name) {
        super(price, name);
    }

    public Stapler(double price, String name,
                int amount, double version) {
        super(price, name, amount);
        this.version = version;
    }

    public double getVersion() {
        if(moreThanZero((int)this.version)) return version;
        this.version = 0;
        return version;
    }

    public void setVersion(double version) {
        if(moreThanZero((int) version)) this.version = version;
        this.version = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stapler:");
        sb.append("amount = "+getAmount()+"\n");
        sb.append("price = "+getPrice()+"\n");
        sb.append("name = "+getName()+"\n");
        sb.append("version = "+getVersion()+"\n");
        sb.append("totalPrice = "+getTotalPrice()+"\n");
        return sb.toString();
    }
}

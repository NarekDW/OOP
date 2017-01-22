package com.epam.courses.oop.t02.things;

import com.epam.courses.oop.t02.product.Product;
import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 17.01.2017.
 */

@EqualsAndHashCode(callSuper = true)
public class Pen extends Product {
    private String color;

    public Pen(double price, String name) {
        super(price, name);
    }

    public Pen(double price, String name,
               int amount, String color) {
        super(price, name, amount);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pen:");
        sb.append("amount = "+getAmount()+"\n");
        sb.append("price = "+getPrice()+"\n");
        sb.append("color = "+getColor()+"\n");
        sb.append("name = "+getName()+"\n");
        sb.append("totalPrice = "+getTotalPrice()+"\n");
        return sb.toString();
    }
}

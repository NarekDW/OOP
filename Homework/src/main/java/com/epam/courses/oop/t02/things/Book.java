package com.epam.courses.oop.t02.things;

import com.epam.courses.oop.t02.product.Product;

/**
 * Created by Narek on 17.01.2017.
 */
public class Book extends Product {
    private int size;

    public Book(double price, String name) {
        super(price, name);
    }

    public Book(double price, String name,
                int amount, int size) {
        super(price, name, amount);
        this.size = size;
    }

    public int getSize() {
        if(moreThanZero(this.size)) return size;
        this.size = 0;
        return this.size;
    }

    public void setSize(int size) {
        if(moreThanZero(size)) this.size = size;
        this.size = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Book:");
        sb.append("amount = "+getAmount()+"\n");
        sb.append("price = "+getPrice()+"\n");
        sb.append("name = "+getName()+"\n");
        sb.append("size = "+getSize()+"\n");
        sb.append("totalPrice = "+getTotalPrice()+"\n");
        return sb.toString();
    }
}

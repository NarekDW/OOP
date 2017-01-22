package com.epam.courses.oop.t03.notepads;

import com.epam.courses.oop.t02.product.Product;
import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 17.01.2017.
 */

@EqualsAndHashCode(callSuper = true)
public class Notepad extends Product {
    private String language;

    public Notepad(double price, String name) {
        super(price, name);
    }

    public Notepad(double price, String name,
                   int amount, String language) {
        super(price, name, amount);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Notepad:");
        sb.append("amount = "+getAmount()+"\n");
        sb.append("price = "+getPrice()+"\n");
        sb.append("name = "+getName()+"\n");
        sb.append("language = "+getLanguage()+"\n");
        sb.append("totalPrice = "+getTotalPrice()+"\n");
        return sb.toString();
    }
}

package com.epam.courses.oop.t03.notepads;

import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 17.01.2017.
 */

@EqualsAndHashCode(callSuper = true)
public class Diary extends Notepad {
    private int size;

    public Diary(double price, String name) {
        super(price, name);
    }

    public Diary(double price, String name,
                 int amount, String language, int size) {
        super(price, name, amount, language);
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
        sb.append("Diary:");
        sb.append("amount = "+getAmount()+"\n");
        sb.append("price = "+getPrice()+"\n");
        sb.append("name = "+getName()+"\n");
        sb.append("language = "+getLanguage()+"\n");
        sb.append("size = "+getSize()+"\n");
        sb.append("totalPrice = "+getTotalPrice()+"\n");
        return sb.toString();
    }
}

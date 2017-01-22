package com.epam.courses.oop.t03.pens;

import com.epam.courses.oop.t02.things.Pen;
import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 17.01.2017.
 */

@EqualsAndHashCode(callSuper = true)
public class AutoPen extends Pen {
    private double version;

    public AutoPen(double price, String name) {
        super(price, name);
    }

    public AutoPen(double price, String name,
                   int amount, String color, double version) {
        super(price, name, amount, color);
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
        sb.append("Pen:");
        sb.append("amount = "+getAmount()+"\n");
        sb.append("price = "+getPrice()+"\n");
        sb.append("color = "+getColor()+"\n");
        sb.append("name = "+getName()+"\n");
        sb.append("version = "+getVersion()+"\n");
        sb.append("totalPrice = "+getTotalPrice()+"\n");
        return sb.toString();
    }
}

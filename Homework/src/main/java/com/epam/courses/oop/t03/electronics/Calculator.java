package com.epam.courses.oop.t03.electronics;

import com.epam.courses.oop.t02.product.Product;
import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 17.01.2017.
 */

@EqualsAndHashCode(callSuper = true)
public class Calculator extends Product {
    private double version;

    public Calculator(double price, String name) {
        super(price, name);
    }

    public Calculator(double price, String name,
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
        return "Calculator: amount = "+getAmount()+"\n" +
                "     price = "+getPrice()+"\n" +
                "     name = "+getName()+"\n" +
                "     version = "+getVersion()+"\n" +
                "     totalPrice = "+getTotalPrice()+"\n";
    }
}

package com.epam.courses.oop.t03.electronics;

import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 17.01.2017.
 */

@EqualsAndHashCode(callSuper = true)
public class Computer extends Calculator {
    private double power;

    public Computer(double price, String name) {
        super(price, name);
    }

    public Computer(double price, String name,
                    int amount, double version, double power) {
        super(price, name, amount, version);
        this.power = power;
    }

    public double getPower() {
        if(moreThanZero((int)this.power)) return power;
        this.power = 0;
        return power;
    }

    public void setVersion(double version) {
        if(moreThanZero((int) version)) this.power = version;
        this.power = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Computer:");
        sb.append("amount = "+getAmount()+"\n");
        sb.append("price = "+getPrice()+"\n");
        sb.append("name = "+getName()+"\n");
        sb.append("version = "+getVersion()+"\n");
        sb.append("power = "+getPower()+"\n");
        sb.append("totalPrice = "+getTotalPrice()+"\n");
        return sb.toString();
    }
}

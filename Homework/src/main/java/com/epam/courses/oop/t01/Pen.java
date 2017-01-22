package com.epam.courses.oop.t01;

/**
 * Created by Narek on 16.01.2017.
 */
public class Pen {

    private double length;
    private double width;
    private String color;

    public Pen(double length, double width, String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }

    double getLength() {
        if(moreThanZero(this.length))
            return length;
        return this.length=0;
    }

    double setLength(double length) {
        if(moreThanZero(length))
            return this.length=length;
        return this.length=0;
    }

    double getWidth() {
        if(moreThanZero(this.width))
            return this.width;
        return this.width=0;
    }

    double setWidth(double width) {
        if(moreThanZero(width))
            return this.width=width;
        return this.width=0;
    }

    String getColor() {
        return this.color;
    }

    String setColor(String color) {
        return this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(null == o) return false;
        if(getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;
        if(length != pen.length) return false;
        if(width != pen.width) return false;
        if(null == color)
            return (color == pen.color);
        else if(!color.equals(pen.color)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (31*length+17*width+((null==color) ? 0 : color.hashCode()));
    }

    @Override
    public String toString() {
        return  getClass().getName()+"@\n"+
                "Length = "+getLength()+"\n" +
                "Width = "+getWidth()+"\n" +
                "Color = "+getColor()+"\n";
    }

    private boolean moreThanZero(double i) {
        if(i<0) return false;
        return true;
    }
}

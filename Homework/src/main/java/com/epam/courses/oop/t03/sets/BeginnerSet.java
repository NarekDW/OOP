package com.epam.courses.oop.t03.sets;

import com.epam.courses.oop.t02.product.Product;
import com.epam.courses.oop.t03.electronics.Computer;
import com.epam.courses.oop.t03.notepads.Notepad;
import com.epam.courses.oop.t03.pens.AutoPen;

/**
 * Created by Narek on 17.01.2017.
 */
public class BeginnerSet {
    private static Product[] beginnerSet ={
            new Computer(999,"Steve",1,10.1,4),
            new Notepad(48,"Maksvel",3, "English"),
            new AutoPen(118, "Lyapunov", 2, "black", 1.2)};
    public BeginnerSet(Product[] bset){
        beginnerSet = bset;
    }

    public static Product[] getBeginnerSet() {
        return beginnerSet;
    }

    public static void setBeginnerSet(Product[] bset) {
        beginnerSet = bset;
    }
}

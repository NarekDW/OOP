package com.epam.courses.oop.t03.sets;

import com.epam.courses.oop.t02.product.Product;
import com.epam.courses.oop.t03.electronics.Computer;
import com.epam.courses.oop.t03.notepads.Notepad;
import com.epam.courses.oop.t03.pens.AutoPen;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Narek on 17.01.2017.
 */
public class BeginnerSetTest {
    private static Product[] set ={
            new Computer(999,"Steve",1,10.1,4),
            new Notepad(48,"Maksvel",3, "English"),
            new AutoPen(118, "Lyapunov",2, "black", 1.2)};

    BeginnerSet bset = new BeginnerSet(set);

    @Test
    public void setTest(){
        assertThat(set[0], is(bset.getBeginnerSet()[0]));
        assertThat(set[1], is(bset.getBeginnerSet()[1]));
        assertThat(set[2], is(bset.getBeginnerSet()[2]));
    }
}

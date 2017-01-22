package com.epam.courses.oop.t02;

import com.epam.courses.oop.t02.things.Pen;
import com.epam.courses.oop.t02.product.Product;
import com.epam.courses.oop.t02.things.Book;
import com.epam.courses.oop.t02.things.Stapler;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Narek on 17.01.2017.
 */
public class ProductTest {

    Product pen1 = new Pen( 21.75, "Albert",2,"blue");
    Product pen2 = new Pen(33.21,"Bor",-3,"black");
    Product book1 = new Book( -100.99, "Thinking in C++",1, 1020);
    Product book2 = new Book( 139.89, "Thinking in Java",2, 1220);
    Product stapler = new Stapler(56.55, "Plank",1, 1.1);

    @Test
    public void getAmountPrice(){
        assertThat(pen1.getPrice(), is(21.75));
        assertThat(pen2.getAmount(), is(0));
        assertThat(pen2.setAmount(-10), is(0));
    }

    @Test
    public void totalPriceTest(){
        double totalPrice = pen1.getTotalPrice()+pen2.getTotalPrice()+
                +book1.getTotalPrice()+book2.getTotalPrice()+
                stapler.getTotalPrice();
        double value = (2*21.75)+(0*33.21)+(0*100.99)+(2*139.89)+(1*56.55);

        assertEquals(totalPrice, value, 0.001);
    }
}

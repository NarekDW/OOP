package com.epam.courses.oop.t04;

import com.epam.courses.oop.t02.product.Product;
import com.epam.courses.oop.t03.electronics.Computer;
import com.epam.courses.oop.t03.notepads.Notepad;
import com.epam.courses.oop.t03.pens.AutoPen;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Narek on 18.01.2017.
 */
public class ProductCompareTest {
    private static Product[] beginnerSet ={
            new Computer(999,"Abel"),
            new Computer(999,"armstrong"),
            new Computer(999,"Nobel"),
            new Notepad(48,"maksvel"),
            new Notepad(98,"Abel"),
            new AutoPen(118, "Lyapunov"),
            new AutoPen(118, "Newton"),
            new AutoPen(118, "Gaus")};
    private ProductCompare comparator = new ProductCompare();

    @Test
    public void compareNameTest(){
        Arrays.sort(beginnerSet,
                comparator.setSortingRule(ProductEnum.NAME));
        for(int i=0; i<beginnerSet.length-1; i++){
            nameAssert(beginnerSet[i], beginnerSet[i+1]);
        }
    }

    @Test
    public void comparePriceTest(){
        Arrays.sort(beginnerSet,
                comparator.setSortingRule(ProductEnum.PRICE));
        for(int i=0; i<beginnerSet.length-1; i++){
            priceAssert(beginnerSet[i], beginnerSet[i+1]);
        }
    }

    @Test
    public void comparePriceNameTest(){
        Arrays.sort(beginnerSet,
                comparator.setSortingRule(ProductEnum.PRICE_AND_NAME));
        for(int i=0; i<beginnerSet.length-1; i++){
            priceNameAssert(beginnerSet[i], beginnerSet[i+1]);
        }
    }

    private void priceAssert(Product p1, Product p2){
        assertTrue(p1.getPrice() <= p2.getPrice());
    }

    private String name1;
    private String name2;
    private char c1;
    private char c2;

    private void nameAssert(Product n1, Product n2){
        name1 = n1.getName().toLowerCase();
        name2 = n2.getName().toLowerCase();
        int length = getMin(name1.length(), name2.length());
        int k =0;
        while(k<length){
            c1 = name1.charAt(k);
            c2 = name2.charAt(k);
            assertTrue(c1<=c2);
            if(c1<c2) break;
            k++;
        }
    }

    private void priceNameAssert(Product pn1, Product pn2){
        if(pn1.getPrice() == pn2.getPrice()){
            nameAssert(pn1, pn2);
        } else{
            priceAssert(pn1, pn2);
        }
    }

    private int getMin(int len1, int len2) {
        return (len1<len2) ? len1 : len2;
    }
}

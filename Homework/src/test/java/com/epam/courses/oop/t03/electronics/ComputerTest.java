package com.epam.courses.oop.t03.electronics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Narek on 17.01.2017.
 */
public class ComputerTest {
    Computer comp1 = new Computer(1035, "hp",1, 7.1, 8);
    Computer comp2 = new Computer(1055, "hp",1, 7.1, 8);
    Computer comp3 = new Computer(1055, "asus",1, 7.1, 16);

    @Test
    public void equalsHashCodeTest(){
        // equals()
        assertTrue(comp1.equals(comp2));
        assertTrue(comp2.equals(comp1));
        assertFalse(comp1.equals(comp3));
        assertFalse(comp2.equals(comp3));
        // hashCode()
        assertEquals(comp1.hashCode(), comp2.hashCode());
        assertNotEquals(comp2.hashCode(), comp3.hashCode());
        assertNotEquals(comp1.hashCode(), comp3.hashCode());
    }
}

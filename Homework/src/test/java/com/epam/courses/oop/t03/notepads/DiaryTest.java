package com.epam.courses.oop.t03.notepads;

import com.epam.courses.oop.t03.pens.AutoPen;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Narek on 17.01.2017.
 */
public class DiaryTest {
    Diary diary1 = new Diary(35, "Puankore",1,"Dutch", 400);
    Diary diary2 = new Diary(38, "Puankore",2,"Dutch", 400);
    Diary diary3 = new Diary(23, "Puankore",3,"English", 386);

    @Test
    public void equalsHashCodeTest(){
        // equals()
        assertTrue(diary1.equals(diary2));
        assertTrue(diary2.equals(diary1));
        assertFalse(diary1.equals(diary3));
        assertFalse(diary2.equals(diary3));
        // hashCode()
        assertEquals(diary1.hashCode(), diary2.hashCode());
        assertNotEquals(diary2.hashCode(), diary3.hashCode());
        assertNotEquals(diary1.hashCode(), diary3.hashCode());
    }
}

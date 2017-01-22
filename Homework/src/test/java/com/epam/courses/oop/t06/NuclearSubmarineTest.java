package com.epam.courses.oop.t06;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Narek on 21.01.2017.
 */
public class NuclearSubmarineTest {
    @Test
    public void launchAndStartTest(){
        NuclearSubmarine sub = new NuclearSubmarine();
        NuclearSubmarine.Engine engine =
                new NuclearSubmarine().new Engine();
        assertThat(sub.launch(), is(true));
        assertThat(engine.start(), is(true));
    }
}
package com.epam.courses.oop.t05.subjects;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by Narek on 20.01.2017.
 */
public class Mark<T extends Number> {
    private T value;
    public Mark() {}
    public Mark(T value) {
        this.value = value;
    }
    public T setAndGetValue(T value){
        this.value = value;
        return this.value;
    }
    @Override
    public String toString(){
        return value.toString();
    }
}

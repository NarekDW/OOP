package com.epam.courses.oop.t05.group;

import com.epam.courses.oop.t05.subjects.Mark;
import com.epam.courses.oop.t05.subjects.Subject;
import lombok.EqualsAndHashCode;

/**
 * Created by Narek on 20.01.2017.
 */
@EqualsAndHashCode(exclude = {"mark", "subject"})
public class Student {
    private String name;
    private Number mark;
    private Subject subject;

    public Student(String name){
        this.name = name;
    }
    public Student(String name, Number mark){
        this(name);
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setMark(Number mark) {
        identifyAndSet(mark);
    }

    public Number getMark() {
        return mark;
    }

    public boolean sameMark(Number ob){
        return mark == ob;
    }

    public boolean sameAnyMark(Number ob){
        return roundMark() == roundMark(ob);
    }

    @Override
    public String toString(){
        return name+"  "+mark+"\n";
    }

    protected void setSubject(Subject subject){
        this.subject = subject;
    }

    private int roundMark(){
        return Math.round(mark.floatValue());
    }

    private int roundMark(Number n){
        return Math.round(n.floatValue());
    }

    private void identifyAndSet(Number mark){
        switch (this.subject){
            case MATHEMATICS:
                this.mark = new Mark<Integer>().setAndGetValue((Integer) mark);
                break;
            case PHYSICS:
                this.mark = new Mark<Double>().setAndGetValue((Double) mark);
                break;
            case PROGRAMMING:
                this.mark = new Mark<Double>().setAndGetValue((Double) mark);
                break;
        }
    }
}

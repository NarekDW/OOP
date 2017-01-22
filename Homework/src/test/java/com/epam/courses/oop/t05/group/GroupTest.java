package com.epam.courses.oop.t05.group;

import com.epam.courses.oop.t05.subjects.Subject;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Narek on 20.01.2017.
 */
public class GroupTest {
    private Student[] mathStudents = {
            new Student("Van Gog"),
            new Student("Albert"),
            new Student("Leibnic"),
    };
    private Student[] physStudents = {
            new Student("Van Gog"),
            new Student("Leibnic"),
            new Student("Puankore")
    };
    private Student[] progStudents = {
            new Student("Van Gog"),
            new Student("Puankore"),
            new Student("Bor"),
    };
    private Group[] groups = {
            new Group(Subject.MATHEMATICS, mathStudents),
            new Group(Subject.PHYSICS, physStudents),
            new Group(Subject.PROGRAMMING, progStudents),
    };

    @Test
    public void findStudentTest(){
        assertThat(groups[0].findStudent("Puankore"), is(false));
        assertThat(groups[1].findStudent("Puankore"), is(true));
        assertThat(groups[2].findStudent("Puankore"), is(true));
    }

    @Test
    public void setAndAssertMarks(){
        Student mathGrStud = groups[0].getStudentByName("Van Gog");
//        mathGrStud.setMark(4.2); ClassCastException!
        mathGrStud.setMark(4);
        Student physGrStud = groups[1].getStudentByName("Van Gog");
        physGrStud.setMark(4.33);
        Student progGrStud = groups[2].getStudentByName("Van Gog");
        progGrStud.setMark(4.77);

        assertTrue(mathGrStud.sameAnyMark(physGrStud.getMark()));
        assertFalse(mathGrStud.sameAnyMark(progGrStud.getMark()));
        assertFalse(physGrStud.sameMark(progGrStud.getMark()));
        assertFalse(physGrStud.sameMark(progGrStud.getMark()));
    }
}
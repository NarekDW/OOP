package com.epam.courses.oop.t05.group;

import com.epam.courses.oop.t05.subjects.Subject;
/**
 * Created by Narek on 20.01.2017.
 */
public class Group {
    private Subject subject;
    private Student[] students;

    public Group(Subject subject, Student ... students) {
        this.subject = subject;
        this.students = students;
        identifySubject();
    }

    public Subject getSubject() {
        return subject;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getStudentByName(String name){
        for(Student s:students){
            if(s.getName().equals(name)) return s;
        }
        return null;
    }

    public boolean findStudent(String sName){
        for(Student s:students)
            if(s.getName().equals(sName))
                return true;
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(subject+":\n");
        for(Student s:students)
            sb.append(s.toString());
        return sb.toString();
    }

    private void identifySubject(){
        switch (subject){
            case MATHEMATICS:
                for(Student s:students)
                    s.setSubject(this.subject);
                break;
            case PHYSICS:
                for(Student s:students)
                    s.setSubject(this.subject);
                break;
            case PROGRAMMING:
                for(Student s:students)
                    s.setSubject(this.subject);
                break;
        }
    }
}

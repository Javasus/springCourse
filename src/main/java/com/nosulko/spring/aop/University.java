package com.nosulko.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();
    public void addStudents() {
        Student st1 = new Student("Roman Nosulko" , 4, 7.5);
        Student st2 = new Student("Ksenia Fedorova" , 5, 9.7);
        Student st3 = new Student("Popastik Popastikovich" , 2, 6.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents.");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }

}

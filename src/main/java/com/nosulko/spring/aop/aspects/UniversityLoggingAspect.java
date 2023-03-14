package com.nosulko.spring.aop.aspects;

import com.nosulko.spring.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice : Логгируем получение списка студентов перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student student1 = students.get(0);
//
//        String nameSurname = student1.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        student1.setNameSurname(nameSurname);
//
//        double avrGrade = student1.getAvgGrade();
//        avrGrade = avrGrade + 1;
//        student1.setAvgGrade(avrGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice : Логгируем получение списка студентов после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice : Логгируем выброс исключения -> " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice : Логгируем нормальное окончание работы метода getStudents() или выброс исключения.");
    }
}

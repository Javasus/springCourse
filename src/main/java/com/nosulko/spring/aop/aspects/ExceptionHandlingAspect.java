package com.nosulko.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class ExceptionHandlingAspect {
    @Before("com.nosulko.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice : " +
                "Ловим/обрабатываем исключения при попытке получить книгу или журнал.");
        System.out.println("__________________________________________");
    }
}

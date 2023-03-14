package com.nosulko.spring.spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {
//  private String name;

//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: INIT METHOD!");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Dog: DESTROY METHOD!");
//    }

    public Dog() {
        System.out.println("Dog bean is created!");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}

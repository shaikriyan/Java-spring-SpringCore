package com.springcore.beans;

public class Student implements Person{

    @Override
    public void live() {
        System.out.println("Student living method");
    }
}

package com.springcore.beans;

public class Employee implements Person{

    @Override
    public void live() {
        System.out.println("Employee living method");
    }
}

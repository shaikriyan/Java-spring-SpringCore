package com.springcore.di;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class Employee {

    private String name;
    private String id;

    private List<String> skills;

    private  Address address;

    public void setName(String name) {
        System.out.println("Employee.setName");
        this.name = name;
    }

    public void setId(String id) {
        System.out.println("Employee.setId");
        this.id = id;
    }

    public void setSkills(List<String> skills) {
        System.out.println("Employee.setSkills");
        this.skills = skills;
    }

    public void setAddress(Address address) {
        System.out.println("Employee.setAddress");
        this.address = address;
    }


    public Employee(String name, String id, List<String> skills, Address address) {
        System.out.println("Employee.Employee all args constructor");
        this.name = name;
        this.id = id;
        this.skills = skills;
        this.address = address;
    }

    public Employee() {
        System.out.println("Employees No args Constructor");
    }

}

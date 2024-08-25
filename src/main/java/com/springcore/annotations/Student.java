package com.springcore.annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Getter
//@Component
public class Student {

    @Value("${stu.name}")
    private String name;

//    @Value("${stu.age}")
    private int age;

    @Autowired
    @Qualifier("address456")
    private Address address;


    @PostConstruct
    public void init(){
        System.out.println("Student.init");
    }


    public void setName(String name) {
        System.out.println("Student.setName");
        this.name = name;
    }

    @Value("${stu.age}")
    public void setAge(int age) {
        System.out.println("Student.setAge");
        this.age = age;
    }

//    @Autowired
    public void setAddress(Address address) {
        System.out.println("Student.setAddress");
        this.address = address;
    }


    public Student(String name, int age, Address address) {
        System.out.println("Student.Student all args constructor");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
        System.out.println("Student.Student no args constructor");
    }

//    @Autowired
    public Student(Address address) {
        System.out.println("Student.Student constructor only for address field");
        this.address = address;
    }


    @PreDestroy
    public void destroy(){
        System.out.println("Student.destroy");
    }
}

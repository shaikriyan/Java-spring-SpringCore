package com.springcore.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {


/*
        Using the xml based configurations

        ClassPathXmlApplicationContext context = getApplicationContext();

        Student student = context.getBean("student", Student.class);
        System.out.println(STR."student = \{student}");
        student.getAddress().showAddress();

        */


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Student student1 = context.getBean("studentxyz", Student.class);
        System.out.println(STR."student = \{student1}");
        student1.getAddress().showAddress();
        context.close();


    }

    private static ClassPathXmlApplicationContext getApplicationContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
        context.registerShutdownHook();
        return context;
    }


}

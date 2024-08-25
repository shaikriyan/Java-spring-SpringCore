package com.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("di-config.xml");

////      primitive types using the simple Setter injection
//        Student student = context.getBean("student1", Student.class);
//        System.out.println(STR."student = \{student}");
//
//
////      primitive types using the simple Constructor injection
//        Student student3 = context.getBean("student3", Student.class);
//        System.out.println(STR."student3 = \{student3}");
//
//
////      Collection + UserDefined Obj using the Setter injection
//        Employee emp = context.getBean("emp", Employee.class);
//        System.out.println(STR."emp = \{emp}");
//        emp.getAddress().showAddress();

//      Collection + UserDefined Obj using the Constructor injection
        Employee emp2 = context.getBean("emp2", Employee.class);
        System.out.println(STR."emp2 = \{emp2}");
        emp2.getAddress().showAddress();


//        u will need to downcast it inorder to use the close method
        ((ClassPathXmlApplicationContext)context).close();


//        there is one more method similar to close()
// TODO Better to use the registerShutdownHook();
//        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
//        this will close the context after the finishing of the main method






    }
}

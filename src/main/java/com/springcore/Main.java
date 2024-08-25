package com.springcore;

import com.springcore.beans.Employee;
import com.springcore.beans.Person;
import com.springcore.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("config file configured successfully...");


        Student student1 = (Student) context.getBean("student1");
        student1.live();


        Employee employee = context.getBean("employee", Employee.class);
        employee.live();


//      Since Employee class is configured in config.xml file, It's implementing the Employee method
//      Later, as per our requirements we can change the impl class to Student (without modifying the sourcecode)

        Person person = context.getBean("person", Person.class);
        person.live();


    }
}
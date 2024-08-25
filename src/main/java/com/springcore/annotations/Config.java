package com.springcore.annotations;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.springcore.annotations")
@PropertySource("applications.properties")
public class Config {

    @Bean("address456")
    public Address addressObj(){
        return new Address();
    }

    @Bean("studentxyz")
    public Student studentObj(){
        Student student = new Student();

        student.setName("Name Using Config class");
        student.setAge(324);
        student.setAddress(addressObj());

        return student;
    }



}

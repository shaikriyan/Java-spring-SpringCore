package com.springcore.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String studentName;

    private int studentAge;

    private String studentCity;

}

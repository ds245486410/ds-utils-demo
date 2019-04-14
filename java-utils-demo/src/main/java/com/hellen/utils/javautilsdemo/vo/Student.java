package com.hellen.utils.javautilsdemo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter@Setter@ToString
public class Student implements Serializable {
    private String name;
    private Integer age;
}

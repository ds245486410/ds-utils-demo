package com.hellen.utils.jsondemo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter@Setter@ToString
public class Waiters implements Serializable {
    private String idNo;
    private String name;
    private Integer age;
}

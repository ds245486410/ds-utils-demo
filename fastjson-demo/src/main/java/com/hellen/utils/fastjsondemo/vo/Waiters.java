package com.hellen.utils.fastjsondemo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter@Setter@ToString
public class Waiters implements Serializable {
    private String idNo;
    private String name;
    private Integer age;
}

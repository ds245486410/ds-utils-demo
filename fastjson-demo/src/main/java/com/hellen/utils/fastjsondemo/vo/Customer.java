package com.hellen.utils.fastjsondemo.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Getter@Setter@ToString
public class Customer {
    private String idNo;
    private BigDecimal amount;
    private List<Waiters> waiters;
}

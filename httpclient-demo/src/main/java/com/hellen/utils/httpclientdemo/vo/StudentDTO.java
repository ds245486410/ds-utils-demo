package com.hellen.utils.httpclientdemo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author daiweihang
 * @date 2019/4/16
 */
@Getter@Setter@ToString
public class StudentDTO implements Serializable {
    private String name;
    private String age;
    private Long id;
}

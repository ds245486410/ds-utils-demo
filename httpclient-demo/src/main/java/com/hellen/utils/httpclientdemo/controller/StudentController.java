package com.hellen.utils.httpclientdemo.controller;

import com.hellen.utils.httpclientdemo.vo.StudentDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daiweihang
 * @date 2019/4/16
 */
@RestController()
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/getOne")
    public StudentDTO getOne(){
        StudentDTO dto = new StudentDTO();
        dto.setId(1001L);
        dto.setName("张三");
        dto.setAge("11");
        return dto;
    }
}

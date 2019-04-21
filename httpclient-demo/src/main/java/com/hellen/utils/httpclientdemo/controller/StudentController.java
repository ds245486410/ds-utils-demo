package com.hellen.utils.httpclientdemo.controller;

import com.hellen.utils.httpclientdemo.vo.StudentDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping("/getList")
    public List<StudentDTO> getList(){
        ArrayList<StudentDTO> list = new ArrayList<>();
        StudentDTO student = new StudentDTO();
        student.setId(11L);
        student.setAge("11");
        student.setName("张三");
        list.add(student);

        student = new StudentDTO();
        student.setId(12L);
        student.setAge("12");
        student.setName("李四");
        list.add(student);
        return list;
    }
}

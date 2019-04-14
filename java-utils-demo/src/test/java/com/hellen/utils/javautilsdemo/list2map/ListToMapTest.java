package com.hellen.utils.javautilsdemo.list2map;

import com.hellen.utils.javautilsdemo.JavaUtilsDemoApplicationTests;
import com.hellen.utils.javautilsdemo.vo.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class ListToMapTest extends JavaUtilsDemoApplicationTests {

    @Test
    public void listToMap(){
        List<Student> studentList = assemble();
        Map<String, Integer> collect = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getAge));
        System.out.println(collect);
    }

    /**
     * 组装list
     * @return
     */
    private List<Student> assemble() {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("张三");
        student.setAge(11);
        students.add(student);

        student = new Student();
        student.setName("李四");
        student.setAge(12);
        students.add(student);

        student = new Student();
        student.setName("王五");
        student.setAge(13);
        students.add(student);
        return students;
    }

}

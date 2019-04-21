package com.hellen.utils.javautilsdemo.list2map;

import com.alibaba.fastjson.JSON;
import com.hellen.utils.javautilsdemo.JavaUtilsDemoApplicationTests;
import com.hellen.utils.javautilsdemo.vo.Student;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONString;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        student = new Student();
        student.setName("王五");
        student.setAge(14);
        students.add(student);
        return students;
    }

    /**
     * list转为map，
     * key为某个参数，value为list内的对象本身
     */
    @Test
    public void tetsList2MapSelf(){
        List<Student> studentList = assemble();
        List<Student> collect = studentList.stream().distinct().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> integers = Arrays.asList(1,1, 3, 5, 6, 7, 8, 9);
        List<Integer> collect1 = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

    }

}

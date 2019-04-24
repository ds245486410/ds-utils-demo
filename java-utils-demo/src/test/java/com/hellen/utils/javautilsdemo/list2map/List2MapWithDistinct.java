package com.hellen.utils.javautilsdemo.list2map;

import com.hellen.utils.javautilsdemo.JavaUtilsDemoApplicationTests;
import com.hellen.utils.javautilsdemo.vo.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
public class List2MapWithDistinct extends JavaUtilsDemoApplicationTests {
    /**
     * 通过filter过滤掉重复的student，然后转换成map
     */
    @Test
    public void testList2Map(){
        HashSet<Long> longs = new HashSet<>();
        List<Student> list = assemble();
        /**
         * 通过filter将重复的信息过滤掉在转换成map
         */
        Map<Long, Student> collect = list.stream().filter((t) -> longs.add(t.getId())).collect(Collectors.toMap(Student::getId, Function.identity()));
        System.out.println(collect);
        /**
         * 不能直接转换成map，因为key重复
         */
        Map<Long, Student> collect1 = list.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
        System.out.println(collect1);
    }

    private List<Student> assemble() {
        ArrayList<Student> list = new ArrayList<>();
        Student student = null;
        student = new Student();
        student.setId(11L);
        student.setAge(11);
        student.setName("李四");
        list.add(student);

        student = new Student();
        student.setId(12L);
        student.setAge(12);
        student.setName("王五");
        list.add(student);

        student = new Student();
        student.setId(13L);
        student.setAge(13);
        student.setName("赵六");
        list.add(student);

        student = new Student();
        student.setId(13L);
        student.setAge(13);
        student.setName("田七");
        list.add(student);

        return list;
    }
}

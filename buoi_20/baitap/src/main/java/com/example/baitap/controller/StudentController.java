package com.example.baitap.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.baitap.domain.Student;

@RestController
@RequestMapping("students")
public class StudentController {
    private static List<Student> list;
    
    static {
        list = new ArrayList<Student>();
        list.add(new Student("Tran Gia Bao", 33));
        list.add(new Student("Nguyen Gia Huy", 13));
        list.add(new Student("Phan Thanh Duy", 12));
        list.add(new Student("Nguyen Thanh Nam", 22));
        list.add(new Student("Le Thi Thanh", 25));
    }

    @GetMapping("add_param")
    public List<Student> add_param(@RequestParam("name") String name, @RequestParam("age") int age) {
        list.add(new Student(name, age));
        return list;
    }

    @GetMapping("add_path/{name}/{age}")
    public List<Student> add_path(@PathVariable("name") String name, @PathVariable("age") int age) {
        list.add(new Student(name, age));
        return list;
    }

    @PostMapping( value = "add_post", consumes = "application/json" )
    public List<Student> add_post(@RequestBody Student student) {
        list.add(student);
        return list;
    }
}

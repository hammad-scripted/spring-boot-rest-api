package net.javaguides.spring_boot_rest_api.controller;

import net.javaguides.spring_boot_rest_api.bean.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {

        return new Student(1, "Mohammad", "Hammad");
    }

    @GetMapping("list")
    public List<Student> getStudentList() {

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "Mohammad", "Hammad"));
        studentList.add(new Student(2, "Mohammad", "Adnaan"));
        studentList.add(new Student(3, "Mohammad", "Fazil"));
        return studentList;
    }

    //    ? path variable
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Integer id) {
       return   new Student(id, "Mohammad", "Hammad");
    }

}

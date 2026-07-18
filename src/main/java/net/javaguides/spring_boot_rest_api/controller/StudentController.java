package net.javaguides.spring_boot_rest_api.controller;

import net.javaguides.spring_boot_rest_api.bean.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent()
    {

        return new Student(1, "Mohammad", "Hammad");
    }
}

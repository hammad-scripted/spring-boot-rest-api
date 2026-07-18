package net.javaguides.spring_boot_rest_api.controller;

import net.javaguides.spring_boot_rest_api.bean.Student;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
        return new Student(id, "Mohammad", "Hammad");
    }

    //* spring boot rest api with request param
    @GetMapping("student/query")
    public Student studentRequestVariable(@RequestParam Integer id, @RequestParam String firstName, @RequestParam String lastName) {
        return new Student(id, firstName, lastName);

    }

    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getLastName());
        return student;
    }

    @PutMapping("student/{id}/update")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") Integer studentId) {

        student.setId(studentId);
        return student;

    }

}

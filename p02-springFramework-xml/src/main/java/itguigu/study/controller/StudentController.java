package itguigu.study.controller;

import itguigu.study.entity.Student;
import itguigu.study.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> findAll(){
        return studentService.fondAll();
    }
}

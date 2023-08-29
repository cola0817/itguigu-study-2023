package itguigu.study.controller;

import itguigu.study.entity.Student;
import itguigu.study.service.StudentService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    StudentService studentService;

    List<Student> findAll(){
        return studentService.findAll();
    }
}

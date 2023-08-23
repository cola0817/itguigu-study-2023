package jdbc;

import itguigu.study.controller.StudentController;
import itguigu.study.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentTest {

    @Test
    public void findAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentController studentController = context.getBean(StudentController.class);
        List<Student> studentList = studentController.findAll();
        studentList.forEach(System.out::println);
    }
}

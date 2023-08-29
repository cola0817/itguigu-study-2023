package itguigu.study.controller;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void findAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentController studentController = context.getBean(StudentController.class);
        studentController.findAll().forEach(System.out::println);
    }
}
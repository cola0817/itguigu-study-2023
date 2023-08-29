package itguigu.study.controller;

import itguigu.study.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;


@SpringJUnitConfig(SpringConfig.class)
class StudentControllerBySpringTest {

    @Resource
    private StudentController studentController;

    @Test
    void findAll() {

        studentController.findAll().forEach(System.out::println);
    }
}
package itguigu.study.controller;

import itguigu.study.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    @Autowired
    HelloService helloService;

    public String sayHello(){
        return helloService.sayHello();
    }
}

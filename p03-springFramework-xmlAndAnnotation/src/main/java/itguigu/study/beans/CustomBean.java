package itguigu.study.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component(value = "Cola")
public class CustomBean {

    @PostConstruct
    public void init(){
        System.out.println("This is Cola bean init ");
    }
}

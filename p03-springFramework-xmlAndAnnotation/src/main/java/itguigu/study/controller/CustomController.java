package itguigu.study.controller;

import itguigu.study.beans.CustomBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CustomController {
    @Autowired
    @Qualifier("Cola")
    CustomBean customBean;

    public void getCustomBean(){
        System.out.println(customBean);
    }
}

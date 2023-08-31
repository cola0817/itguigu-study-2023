package itguigu.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/views")
public class RouterController {

    /**
     * @return home 视图
     */
    @GetMapping("home")
    public String home(Model model){
        System.out.println("RouterController Home");
        model.addAttribute("msg", "Hello This is Home Page ");
        return "home";
    }

}

import itguigu.study.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloControllerTest {


    @Test
    public void sayHello(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        HelloController helloController = context.getBean(HelloController.class);
        System.out.println(helloController.sayHello());
    }
}

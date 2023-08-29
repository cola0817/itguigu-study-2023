import itguigu.study.controller.CustomController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomBeanTest {

    @Test
    public void getBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        CustomController customController = context.getBean(CustomController.class);
        customController.getCustomBean();
    }
}

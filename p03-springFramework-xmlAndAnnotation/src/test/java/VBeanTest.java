import itguigu.study.beans.VBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class VBeanTest {

    @Test
    public void getBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        VBean vBean = context.getBean(VBean.class);
        System.out.println(vBean);
    }

}
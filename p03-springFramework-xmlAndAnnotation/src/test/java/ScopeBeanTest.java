import itguigu.study.beans.ScopeBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeBeanTest {


    @Test
    public void model(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        ScopeBean scopeBean1 = context.getBean(ScopeBean.class);
        ScopeBean scopeBean2 = context.getBean(ScopeBean.class);
        System.out.println(scopeBean1);
        System.out.println(scopeBean2);
    }
}

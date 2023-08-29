import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringFrameworkTest {

    @Test
    public void loadComponentContext(){

        ApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
        for (String beanDefinition : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinition);
        }
    }

    @Test
    public void loadStaticFactoryContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("staticFactory.xml");
        for (String beanDefinition : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinition);
        }
    }

    @Test
    public void loadInstanceFactoryContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("instanceFactory.xml");
        for (String beanDefinition : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinition);
        }
    }

}

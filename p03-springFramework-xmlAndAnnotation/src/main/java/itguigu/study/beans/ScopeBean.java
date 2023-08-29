package itguigu.study.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ScopeBean {


    @PostConstruct
    public void init(){
        System.out.println("Scope Bean init");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Scope Bean pre destroy");
    }
}

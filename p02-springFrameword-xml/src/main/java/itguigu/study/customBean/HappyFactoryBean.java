package itguigu.study.customBean;

import itguigu.study.dao.Happy;
import org.springframework.beans.factory.FactoryBean;

public class HappyFactoryBean implements FactoryBean<Happy> {

    private Integer id;
    private String message;

    public HappyFactoryBean() {
    }

    public HappyFactoryBean(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Happy getObject() throws Exception {
        Happy happy = new Happy(id,message);
        return happy;
    }

    @Override
    public Class<?> getObjectType() {
        return Happy.class;
    }
}

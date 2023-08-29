package itguigu.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VBean {
    @Value("${VBean.name:111}")
    private String name;
    @Value("${VBean.age:222}")
    private Integer  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "VBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
